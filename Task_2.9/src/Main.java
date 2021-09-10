public class Main {
    public static void main(String[] args) {
        boolean man = false;
        int[] array = {2, 5, 10, 21};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                man = true;
                break;
            }
        }

                System.out.println(man);
        }

    }
