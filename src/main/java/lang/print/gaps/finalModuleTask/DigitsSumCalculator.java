package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        //4587
        int d1 = number / 1000; // 4 ++
        int n1 = d1 * 1000; // 4000
        int n2 = number - n1; // 587
        int d2 = n2 / 100; // 5 ++
        int n3 = d2 * 100; // 500
        int n4 = n2 - n3; // 87
        int d3 = n4 / 10; // 8 ++
        int n5 = d3 * 10; // 80
        int d4 = n4 - n5; // 7 ++

        int result = d1 + d2 + d3 + d4;

        System.out.println(result);

    }
}
