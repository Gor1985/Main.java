public class Main {
    public static void main(String[] args) {

        Person person=new Person(65,"Василий",null,null);
        Person person1=new Person(70,"Светлана",null,null);
        Person person2=new Person(50,"Олег",person,person1);
        Person person3=new Person(75,"Ольга",null,null);
        Person person4=new Person(80,"Виталий",null,null);
        Person person5=new Person(45,"Матильда",person4,person3);
        Person person6=new Person(20,"Алексей",person2,person5);
        person6.info();
    }
}
        class Person {
            int age;
            String name;
            Person father;
            Person mather;

            Person(int age, String name, Person father, Person mather) {
                this.age = age;
                this.name = name;
                this.father = father;
                this.mather = mather;
            }
        void info() {
        String nik = "Мое имя " + this.name + "\n";
        nik += "Мне " + this.age + " лет";
        if (this.mather != null) {
        nik += " Мою маму зовут " + this.mather.name + ", а моего папу зовут " + this.father.name + "\n";
        nik += "Моей маме " + this.mather.age + ", а моему папе " + this.father.age + "\n";
        if (this.mather.mather != null) ;
        nik += "Мою бабушку по маминой линии зовут " + this.mather.mather.name + " Моего дедушку по маминой линии зовут " + this.mather.father.name + "\n";
        nik += "Моей бабушке Ольге " + this.mather.mather.age + ", моему дедушке Виталию " + this.mather.father.age + "\n";
        if (this.father.father != null && this.father.mather != null) ;
        nik += "Моего дедушку по папиной линии зовут " + this.father.father.name + " ему " + this.father.father.age + " лет" + "\n";
        nik += "Мою бабушку по папиной линии зовут " + this.father.mather.name + " ей " + this.father.mather.age + " лет";
    }

            System.out.println(nik);
}
            public Person getFather() {
                return father;
            }
            public int getAge() {
                return age;
            }
            public String getName() {
                return name;
            }
            public Person getMather() {
                return mather;
            }
        }



