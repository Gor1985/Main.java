import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 4, 7, 8, 8,9, 10};


        for (int i = 0; i < array.length-1; i++) {

             if (array[i]==array[i+1]) {
                 System.out.println("Да");
                 break;
             }else   if (i == args.length-1) {
                     System.out.println("Нет");
                 }

                 //  }else if (array[i] == array[i+1]) ;{
                 // System.out.println("Да");
                 // break;
             }

                }

            }









