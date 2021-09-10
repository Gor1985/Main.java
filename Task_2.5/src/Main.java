import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите ваше число");
        int b = scanner.nextInt();

        for (int i = 0; i <= 20; i++) {
            if (b == 10 && i == 10) {
                System.out.println("Верно");
            } else if (b!=10){
                System.out.println("Неверно");
                break;

            }
        }
    }
}




