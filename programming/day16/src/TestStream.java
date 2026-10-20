import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class TestStream {

    public static void main(String[] args) {

        // List<String> names = List.of("Amina", "Ben", "Alice", "Dana", "Carlos");
        List<String> names = new ArrayList<>(
                List.of("Amina", "Ben", "Alice", "Dana", "Carlos"));
    
        List<String> result = new ArrayList<>();

        for (String name : names) {
            if (name.startsWith("A")) {
                result.add(name.toUpperCase());
            }
        }
        System.out.println(result);
        // System.out.println(names.stream());
        List<String> onlyA = names.stream()
                        .filter(name -> name.startsWith("A"))
                        .map(name -> name.toUpperCase())
                        .toList();

         System.out.println(onlyA);

    }
}