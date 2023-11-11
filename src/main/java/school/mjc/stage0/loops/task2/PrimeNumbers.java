package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter;
        for (int i = 2; i <= printToInclusive; i++) {
            counter = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 0) System.out.println(i);
        }
    }
}
