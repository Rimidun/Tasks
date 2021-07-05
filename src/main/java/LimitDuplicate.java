import java.util.*;

public class LimitDuplicate {
    public static void main(String[] args) {
        int[] arrays = {2, 2, 6, 6, 7, 1, 2, 4, 4, 4, 4, 7, 7};
        int max = 2;

        for (int i = 0; i < result(arrays, max).length; i++) {
            System.out.print(result(arrays, max)[i] + " ");

        }


    }

    public static int[] result(int[] arrays, int max) {

        //int [] result = new int[arrays.length];
//        int [] result = arrays.clone();
//        result[1] =


            if (max < 1)
                return new int[]{};

            Map<Integer, Integer> numOfElementsMap = new HashMap<>();
            List<Integer> list = new ArrayList<>(arrays.length);

            for (int element : arrays) {
                if (numOfElementsMap.get(element) == null || numOfElementsMap.get(element) < max)
                    list.add(element);
                numOfElementsMap.merge(element, 1, Integer::sum);

            }

            return list.stream().mapToInt(Integer::intValue).toArray();


    }
}













