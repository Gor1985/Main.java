
package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.spi.CurrencyNameProvider;

public class Server {
    private static Object String;

    public static void main(String[] args) {
        ArrayList<Socket> usersSocket = new ArrayList<>();
        ArrayList<String>names=new ArrayList<>();
        try {
            ServerSocket serverSocket = new ServerSocket(8188);

            System.out.println("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Подключился новый клиент. ");

                usersSocket.add(socket);
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in = new DataInputStream(socket.getInputStream());

                 DataInputStream bon=new DataInputStream(socket.getInputStream());
                String name;
                name=in.readUTF();
                names.add(name);

                //out.writeUTF(name);
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            for (String nameSoket:names);
                            System.out.println(name+"");
                            while (true) {
                                String text;
                                text = in.readUTF();
                                for (Socket userSocket : usersSocket) {
                                    String mex=name+" :"+text;
                                    System.out.println(mex);
                                }
                            }
                        } catch (IOException exception) {
                            usersSocket.remove(socket);
                            names.remove(name);
                            System.out.println("Клиент отключился");
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