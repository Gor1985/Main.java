import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите длинну");
            int a= scanner.nextInt();
        System.out.println("Введите ширину");
            int b=scanner.nextInt();
        System.out.println("Введите высоту");
            int d=scanner.nextInt();
            int c=a*d*b;
            System.out.println("Объём бассейна равен: "+c);

        }
    }

