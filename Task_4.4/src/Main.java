public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog("Собака",25,5);
        Mouse mouse=new Mouse("Мышь",20,1);
       Cat cat=new Cat("Кошка",19,3);
    }
}
class Dog{
String name;
int height;
int tailLength;
public Dog(String name, int height,int tailLength){
    this.name=name;
    this.height=height;
    this.tailLength=tailLength;

}

}
class Mouse{

    String name;
    int height;
    int tailLength;
    public Mouse(String name, int height,int tailLength){
        this.name=name;
        this.height=height;
        this.tailLength=tailLength;
    }

}
class Cat{

    String name;
    int height;
    int tailLength;
    public Cat(String name, int height,int tailLength){
        this.name=name;
        this.height=height;
        this.tailLength=tailLength;
    }

}