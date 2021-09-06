import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите ваше число");
       float a= scanner.nextInt();
        System.out.println("Result: "+(a+(a*0.15)));
    }


}
