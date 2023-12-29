package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public static void printWhichIsBigger(int first, int second) {
        //int greatest;
        System.out.println(first > second ? "first" : "second");
    }
    public static void main(String[] args) {
        printWhichIsBigger(7, 7);
    }
}
