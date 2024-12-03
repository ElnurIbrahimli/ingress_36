package TaskInterface.Task4;

public class AmphibiousPlane implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("The plane is flying");

    }

    @Override
    public void swim() {
        System.out.println("The plane is swimming");

    }
}
