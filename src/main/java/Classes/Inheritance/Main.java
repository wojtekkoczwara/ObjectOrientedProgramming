package Classes.Inheritance;

public class Main {

    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        dog.eat();

        Dog dog1 = dog;
        System.out.println(dog.getName());
        System.out.println(dog1.getName());

        dog1.setName("maxie");
        System.out.println(dog.getName());
        System.out.println(dog1.getName());
    }



}



