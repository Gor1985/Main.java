
package Server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;


public class Server {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        try {
            ServerSocket serverSocket = new ServerSocket(8188);

            System.out.println("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();

                User currentUser = new User(socket);


                users.add(currentUser);
                System.out.println("Подключился новый клиент");
                currentUser.setOut(new DataOutputStream(currentUser.getSocket().getOutputStream()));
                currentUser.setIn(new DataInputStream(currentUser.getSocket().getInputStream()));

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String name = "";
                        String text;

                        try {
                            currentUser.getOut().writeUTF("Введите имя: ");
                            String userName = currentUser.getIn().readUTF();
                            for (User user : users) {
                                name += (user.getUserName() + ", ");

                                if (name.contains(userName)) {
                                    currentUser.getOut().writeUTF("Имя занято, перезайдите");
                                    System.out.println("Имя занято");
                                    socket.close();
                                }
                            }

                            if (!name.contains(userName))

                                currentUser.setUserName(userName);
                            for (User user : users)
                                user.getOut().writeUTF("Пользователь " + currentUser.getUserName() + " присоединился к беседе");

                            while (true) {
                                text = currentUser.getIn().readUTF();
                                if (text.equals("/onlineUsers")) {
                                    String names = "Пользователи онлайн: ";
                                    for (User user : users) {
                                        names += user.getUserName() + "  ";

                                    }
                                    currentUser.getOut().writeUTF(names); // Отправили список
                                }else if (text.indexOf("/n")==0){
                                    String[] na= text.split("");
                                    for (User user:users) {
                                        if (user.getUserName().equals(na[1])) {
                                            user.getOut().writeUTF(na[2]);
                                            break;
                                        }
                                    }
                                } else {
                                    // Рассылка сообщения
                                    System.out.println(currentUser.getUserName() + ": " + text);
                                    for (User user : users) {
                                        if (currentUser.getUuid().equals(user.getUuid())) continue;
                                        user.getOut().writeUTF(currentUser.getUserName() + ": " + text);
                                    }







                                }
                            }



                        } catch (IOException exception) {
                            users.remove(currentUser);
                            for (User user : users) {
                                try {
                                    user.getOut().writeUTF("Пользователь " + currentUser.getUserName() + " покинул беседу");
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            System.out.println("Пользователь " + currentUser.getUserName() + " покинул беседу");
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}