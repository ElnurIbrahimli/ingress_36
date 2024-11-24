package MentorTask.Task1.Task2;

public class Main {

    public static void main(String[] args) {
        Animal.speak();
        Dog.speak();

        Animal animla = new Animal();
        Animal dogAsAnimal = new Animal();
        Dog dog = new Dog();

        animla.speak();

        dogAsAnimal.speak();
        animla.speak();

    }

}
