package TaskInterface.Task7;



public class Document implements Readable, Printable {
    @Override
    public void display() {
        Readable.super.display();
    }
}
