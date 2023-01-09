package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        //number is 478
        int r1 = number / 100; // 4 ++
        int n2 = r1 * 100; // 400
        int n3 = number - n2; // 78
        int n4 = n3 / 10; // 7
        int r2 = n4 * 10; // 70 ++
        int n5 = n3 - r2; // 8
        int r3 = n5 * 100; // 800 ++

        System.out.println(r1 + r2 + r3);

    }
}
