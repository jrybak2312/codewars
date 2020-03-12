import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> list = createList(n);
        int index = 0;
        while (list.size() > 1) {
            index = getIndexOfElementToCountDown(list, index, k);
            countOut(list, index);
        }
        return list.get(0);
    }

    private static List<Integer> createList(int n) {
        return IntStream.range(1, n + 1)
                .boxed()
                .collect(toCollection(LinkedList::new));
    }

    private static int getIndexOfElementToCountDown(List<Integer> list, int previousIndex, int k) {
        int totalIndex = previousIndex + k - 1;
        return totalIndex % list.size();
    }

    private static void countOut(List<Integer> list, int index) {
        list.remove(index);
    }
}