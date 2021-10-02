import java.util.Objects;
// все персоны работают
public class Main {
    public static void main(String[] args) {

        Person person=new Person(65,"Василий",null,null);
        Person person1=new Person(70,"Светлана",null,null);
        Person person2=new Person(50,"Олег",person,person1);
        Person person3=new Person(75,"Ольга",null,null);
        Person person4=new Person(80,"Виталий",null,null);
        Person person5=new Person(45,"Матильда",person4,person3);
        Person person6=new Person(20,"Алексей",person2,person5);
        // person6.info();
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

                nik += "Мне " + this.age + " лет ";
                if (this.mather != null & this.father!=null) {
                    nik += "мою маму зовут " + this.mather.name + "\n";
                    nik += "Моей маме " + this.mather.age + " лет" + "\n";
                    nik += "Моего папу зовут " + this.father.name + "\n";
                    nik += "Моему папе " + this.father.age + " лет" + "\n";
                    if (this.mather.father != null && this.mather.mather != null) {
                        nik += "Мою бабушку по маминой линии зовут " + this.mather.mather.name + "\n";
                        nik += "Моего дедушку по маминой линии зовут " + this.mather.father.name + "\n";
                        nik += "Моего дедушку по папиной линии зовут " + this.father.father.name + "\n";
                        nik += "Мою бабушку по папиной линии зовут " + this.father.mather.name + "\n";
                    }
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



