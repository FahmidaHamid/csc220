import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
       
        Map<String, Integer> scores = new HashMap<>();

        scores.put("S101", 85);
        scores.put("S102", 92);
        scores.put("S103", 78);

        System.out.println(scores.get("S102")); // 92
        System.out.println(scores.containsKey("S104")); // false
        System.out.println(scores.size()); // 3

        scores.put("S103", 100);
        scores.put("S109", 78);

        // iterate over the map
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ">> score: " + entry.getValue());
        }

        // need only the keys
        for (String id : scores.keySet()) {
            System.out.println(id);
        }

        // KEY, then get
        for (String id : scores.keySet()) {
            System.out.println(id + ": " + scores.get(id));
        }

        // remove an item
        scores.remove("S103");

        // iterate over the map
        // for (Map.Entry<String, Integer> entry : scores.entrySet()) {
        //     System.out.println(entry.getKey() + ">> score: " + entry.getValue());
        // }

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(
                    "Key: " + key
                            + ", hashCode: " + key.hashCode()
                            + ", value: " + value);
        }
    }
}