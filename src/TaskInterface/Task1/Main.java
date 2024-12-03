package TaskInterface.Task1;

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        VideoPlayer vp = new VideoPlayer();
        vp.play();
        vp.stop();
        mp.play();
        mp.stop();

    }

}
