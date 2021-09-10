public class Main {
    public static void main(String[] args) {
        int[] array={1,4,6,8};
          int a=0;
        int count=0;
        for (int i = 0; i < array.length ; i++) {
            a+=array[i];
            if (a<=10)
                count++;

            }
            System.out.println(count+1);
        }
    }

