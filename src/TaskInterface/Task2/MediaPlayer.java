package TaskInterface.Task2;

public class MediaPlayer implements AdvancedPlayable {

    @Override
    public void pause() {
        System.out.println("Pasusing");
    }

    @Override
    public void play() {
        System.out.println("Playing");

    }

    @Override
    public void stop() {
        System.out.println("Stopping");

    }
}
