package Klient;

import Server.Server;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        try {
            Socket socket = new Socket("192.168.1.5", 8188);
            System.out.println("Успешно подключен!");


            // Поток ввода
            DataInputStream in = new DataInputStream(socket.getInputStream());
            // Поток вывода
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                    String text;
                        while (true) {
                            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                            DataInputStream in = new DataInputStream(socket.getInputStream());
                            String response = in.readUTF();

                            System.out.println(response);


                        }
                    } catch (IOException e) {
                        System.out.println("Соединение разорвано");
                    }
                }
            });
            thread.start();
            System.out.println("Введите ваше имя: ");
            String name = scanner.nextLine();
            out.writeUTF(name);
            Scanner scanner1=new Scanner(System.in);
            out.writeUTF(scanner1.nextLine());



        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}