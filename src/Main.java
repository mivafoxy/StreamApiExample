import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        for (Integer number : makeNewCollection()) {
            if (number % 2 == 0) {
                result += number;
            }
        }
        System.out.println(result);

        List<Integer> integers = makeNewCollection();
        result = integers
            .stream()
            .filter(number -> number % 2 == 0)
            .reduce((eachResult, nextElement) -> eachResult + nextElement)
            .orElse(0);

        System.out.println(result);

        List<Integer> skipped = integers.stream().skip(50).collect(Collectors.toList());
        //System.out.println(skipped);

        List<Integer> duplicates = makeDuplicateCollection();
        List<Integer> uniq = duplicates.stream().distinct().collect(Collectors.toList());
        //System.out.println(duplicates);
        //System.out.println(uniq);

        List<Integer> mapped = integers.stream().map(element -> element * 10).collect(Collectors.toList());
        //System.out.println(mapped);

        //List<Integer> peeked = integers.stream().peek(element -> System.out.println(element)).collect(Collectors.toList());

        List<Integer> limited = integers.stream().limit(50).collect(Collectors.toList());
        //System.out.println(limited);

        List<Integer> sorted = integers.stream().sorted().collect(Collectors.toList());
        //System.out.println(sorted);

        List<List<String>> lists = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
        //System.out.println(lists);

        List<String> flatMapped = lists.stream().flatMap(element -> element.stream()).collect(Collectors.toList());
        //System.out.println(flatMapped);

        //System.out.println(integers.stream().findFirst());

        //System.out.println(integers.stream().findAny());
        //System.out.println(integers.stream().count());
        //System.out.println(integers.stream().anyMatch(element -> element > 50));
        //System.out.println(integers.stream().noneMatch(element -> element < 0));
        //System.out.println(integers.stream().allMatch(element -> element > 50));
        //System.out.println(integers.stream().min(Integer::compareTo));
        //System.out.println(integers.stream().max(Integer::compareTo));
        //integers.stream().forEach(element -> System.out.println(element));

        // f(x) = x + y;
        // stream.filter(f(x));
        // (аргументы) -> { тело };
    }

    public static boolean isNumber(int number) {
        return number % 2 == 0;
    }

    public static List<Integer> makeNewCollection() {
        List<Integer> collection = new ArrayList<>();
        for (int i = 100; i > 0; i--) {
            collection.add(i);
        }
        return collection;
    }

    public static List<Integer> makeDuplicateCollection() {
        List<Integer> collection = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            collection.add(1);
        }
        return collection;
    }
}
