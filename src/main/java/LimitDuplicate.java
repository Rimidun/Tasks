import java.util.*;

public class LimitDuplicate {
    public static void main(String[] args) {
        int[] elements = {2, 2, 6, 6, 7, 1, 2, 4, 4, 4, 4, 7, 7};
        int maxOccurrences = 1;

        for (int i = 0; i < result(elements, maxOccurrences).length; i++) {
            System.out.print(result(elements, maxOccurrences)[i] + " ");
        }
    }

    public static int[] result(int[] elements, int maxOccurrences) {

        if (maxOccurrences < 1)
            return new int[]{};

        Map<Integer, Integer> numOfElementsMap = new HashMap<>();
        List<Integer> list = new ArrayList<>(elements.length);

        for (int element : elements) {
            if (numOfElementsMap.get(element) == null || numOfElementsMap.get(element) < maxOccurrences)
                list.add(element);
            numOfElementsMap.merge(element, 1, Integer::sum);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}













