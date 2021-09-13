public class Main {
    public static void main(String[] args) {

       Cat cat=new Cat();
       Cat cat1=new Cat();

       cat.age=12;
       cat.weight=12;
       cat.strength=8;

       cat1.age=10;
       cat1.weight=12;
       cat1.strength=8;
        System.out.println(cat.fight(cat1));

    }

}
    class Cat {
        public int age;
        public int weight;
        public int strength;

        public Cat() {
        }


        public boolean fight(Cat anotherCat) {

            int lack = this.age + this.weight +this.strength;
            int lack1 = anotherCat.age + anotherCat.weight + anotherCat.strength;

            if (lack > lack1) {
                return true;
            } else {
                return false;
            }
        }

    }







