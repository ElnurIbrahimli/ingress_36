package MentorTask.Task1;

public class AdvancedCalculator extends Calculator{

    @Override
    public void add(int a, int b) {
        System.out.println("Using AdvancedCalculator for integer addition.");
        super.add(a, b);
    }
}
