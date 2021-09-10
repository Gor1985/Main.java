public class Main {
    public static void main(String[] args) {
        int a = 30;
        boolean man=false;
        for (int i = 2; i <31 ; i++) {
       if (a%i==0) {
           man = true;
           System.out.println(man);
           break;
       }else if (a%i!=0){
           System.out.println(man);
          break;
       }

        }
    }
}
