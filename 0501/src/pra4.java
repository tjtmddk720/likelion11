class Animal{
    String kind;
    String name;
    int age;
    void makeSound(){
        System.out.println("동물은 소리를 낸다");
    }
}
class Cat extends Animal{
    Cat(String kind,String name, int age){
        this.kind=kind;
        this.name=name;
        this.age=age;
    }
    void makeSound(){
        System.out.println("야옹");
    }
}
class Dog extends Animal{
    Dog(String kind,String name, int age){
        this.kind=kind;
        this.name=name;
        this.age=age;
    }
    void makeSound(){
        System.out.println("멍멍");
    }
}
public class pra4 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat("고양이","서연유",4);
        Dog d = new Dog("강아지","땅콩",2);
        a.makeSound();
        c.makeSound();
        d.makeSound();
    }
}
