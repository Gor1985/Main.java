import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        float summ = scan.nextFloat();
        System.out.println("Введите выбранный процент");
        float proc = scan.nextFloat();
        System.out.println("Введите срок , на который хотите сделать вклад");
        float i = scan.nextInt();

        for (i = 1; i <= 5; i++) {
            float itog =summ+(summ*i/100);

            System.out.println("Ваша сумма вклада " + summ + ", ваши проценты, " + proc + " ваш срок вклада " + i+" лет, " +" Ваша сумма составит: "+ itog);


            }
        }

}