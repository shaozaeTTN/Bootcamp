package Collection;


import java.util.*;

/*Print the elements of an array in the decreasing frequency if 2 numbers have same
frequency then print the one which came first.
 */


class Sortfrequency implements Comparator<Integer> {
    private final Map<Integer, Integer> finalmap;


    Sortfrequency(Map<Integer, Integer> finalmap) {
        this.finalmap = finalmap;
    }

    @Override
    public int compare(Integer k1, Integer k2) {

        int comparefrequency = finalmap.get(k2).compareTo(finalmap.get(k1));
        int comparevalue = k1.compareTo(k2);

        if (comparefrequency == 0) {
            return comparevalue;
        } else {
            return comparefrequency;
        }
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,4,4,1,6,6,7,7,7,6,8,9,9,1};
        Map<Integer, Integer> map = new HashMap();
        List<Integer> list = new ArrayList<>();

        for (int current : arr) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1 );
            list.add(current);
        }

        Sortfrequency sortobj = new Sortfrequency(map);
        Collections.sort(list, sortobj);
        list.forEach(e -> System.out.print(e+ " "));
    }
}
