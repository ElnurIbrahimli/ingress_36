package TaskInterface.Task1;

public class VideoPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Start the video");
    }

    @Override
    public void stop() {
        System.out.println("Stop the video");

    }
}
