public class Main {

    public static void main(String[] args) {

            int num[] = {4, 2, 6, 2, 65};
            int i = 0;
        F(0,num);
        }

            public static void F(int i, int num[]) {
                if (i < (num.length - 1)) {
                    System.out.println(num[i]);
                    F(i+1,num);
                }

                System.out.println(num[i]);

        }
    }
