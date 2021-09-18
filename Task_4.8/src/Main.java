import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room((byte) 1, false, false, true, (byte) 11),
                new Room((byte) 2, true, true, false, (byte) 12),
                new Room((byte) 1, false, true, true, (byte) 13),
                new Room((byte) 3, true, false, false, (byte) 21),
                new Room((byte) 2, false, false, false, (byte) 22),
                new Room((byte) 1, true, true, true, (byte) 23),
                new Room((byte) 3, false, true, false, (byte) 31),
                new Room((byte) 3, true, true, false, (byte) 32),
                new Room((byte) 1, false, false, true, (byte) 33),
        };
        String help = "*----*\n" +
                "getFreeRooms  - показать все свободные комнаты\n" +
                "Sleep  - показать  комнаты и количество спальных мест\n" +
                "reserveRoom [номер комнаты] - забронировать комнату\n" +
                "getReservedRooms - показать забронированные комнаты\n" +
                "WC - показать  комнаты c туалетом\n" +
                "Eat - показать  комнаты c завтраком\n" +
                "NoReserved-освободить комнату\n" +
                "exit - выход из программы\n" +
                "help - вывод подсказки по командам\n" +
                "*----*";


        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            System.out.println("Введите команду");
            command = scanner.nextLine();
         if (command.equals("getFreeRooms")) {
                hotel.getFreeRooms();
            } else if (command.equals("reserveRoom")) {
                System.out.print("Введите номер комнаты для бронирования: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.reserveRoom(roomNumber);
            } else if (command.equals("NoReserved")) {
                System.out.print("Введите номер комнаты для освобождения: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.noReserv(roomNumber);
            } else if (command.equals("WiFi")) {

                hotel.wiFi();
            }else if (command.equals("WC")) {
             hotel.WC();
         }else if (command.equals("Eat")) {
                    hotel.EAT();
         }else if (command.equals("Sleep")) {
                    hotel.Sleep();

                } else if (command.equals("help")) {
                    System.out.println(help);
                } else {
                    System.out.println("Ошибка: неизвестная команда, для получения списка команд, введите help");
                }
                command = scanner.nextLine();
            }
        }
    }





