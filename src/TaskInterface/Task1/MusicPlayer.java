package TaskInterface.Task1;

public class MusicPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Start the music");
    }

    @Override
    public void stop() {
        System.out.println("Stop the music");

    }
}
