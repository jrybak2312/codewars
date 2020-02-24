import java.util.ArrayList;
import java.util.List;

public class Thirteen {
    private final static List<Integer> REMAINDERS_OF_THE_INTEGER_DIVISIONS = List.of(1, 10, 9, 12, 3, 4);

    public static long thirt(int n) {
        List<Integer> digits = splitByDigits(n);
        int sum = multiplyAndSum(digits);
        if (sum == n) {
            return n;
        }

        return thirt(sum);
    }

    private static List<Integer> splitByDigits(int n) {
        List<Integer> result = new ArrayList<>();

        while (n > 0) {
            result.add(n % 10);
            n = n / 10;
        }

        return result;
    }

    private static int multiplyAndSum(List<Integer> digits) {
        int result = 0;
        for (int i = 0; i < digits.size(); i++) {
            int remindersListIndex = getRemindersListIndex(i);
            result += REMAINDERS_OF_THE_INTEGER_DIVISIONS.get(remindersListIndex) * digits.get(i);
        }
        return result;
    }

    private static int getRemindersListIndex(int i) {
        return i % REMAINDERS_OF_THE_INTEGER_DIVISIONS.size();
    }
}
