import java.util.Scanner;
import java.util.stream.LongStream;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }

    /**
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    private static boolean isPrime(long number) {
        return LongStream.range(2, number).allMatch(ele -> number % ele != 0);
    };
}
