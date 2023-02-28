import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);

        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);

        final Map<String, Integer> map3 = new HashMap<>();
        map3.put("C++", 90);
        map3.put("ASM", 80);
        map3.put("Haskell", 80);
        map3.put("faszom", 80);
        map3.put("abcd", 80);


        System.out.println(myLanguages(map1));
        System.out.println(myLanguages(map2));
        System.out.println(myLanguages(map3));

        int[] min1= new int[] {1,3,1};
        int[] min2= new int[] {4, 7, 5, 7};
        int[] min3= new int[] {4, 8, 1, 4};
        int[] min4= new int[] {5, 7, 9, 5, 7};
        int[] min5= new int[] {6, 7, 8, 7, 6, 6};
        int[] min6= new int[] {1, 9, 3, 1, 7, 4, 6, 6, 7};


        System.out.println(minValue(min1));
        System.out.println(minValue(min2));
        System.out.println(minValue(min3));
        System.out.println(minValue(min4));
        System.out.println(minValue(min5));
        System.out.println(minValue(min6));




    }

    public static List<String> myLanguages(final Map<String, Integer> unsortresults) {

       HashMap<String, Integer> temp
                = unsortresults.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getValue().compareTo(
                        i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        ArrayList<String> language = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            if (entry.getValue() >= 60) {
                language.add(entry.getKey());
            }
        }

        Collections.reverse(language);

        return language;
    }


    public static int minValue(int[] values){

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <values.length ; i++) {
           numbers.add(values[i]);
        }

        Set<Integer> set = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(set);

        //Collections.sort(numbers);

        String min="";
        for (Integer x: set) {
            min = min +x;
        }

        int minnumber = Integer.parseInt(min);
        return minnumber;
    }


}