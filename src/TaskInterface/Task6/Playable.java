package TaskInterface.Task6;

public interface Playable {
    default void defaultPlayMessage(){
        System.out.println("Playing media. ");
    }
}
