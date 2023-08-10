package day19;

import com.sun.javafx.collections.MappingChange;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Projects\\JavaMarathon2021\\JavaPractice\\JavaMarathon2021\\JavaPractice\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        countWords(file);

    }

    public static void countWords(File file) {
        Map<Integer, String> map = new HashMap<>();
        int i = 0;
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                map.put(i++, word);
                // scanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // считает количество повторяющихся значений и добавляет в Map
        Map<String, Integer> result = new HashMap<>();
         for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Integer count = result.get(value);
            if (count == null)
                result.put(value, 1);
            else
                result.put(value, count + 1);
        }
// Сортируем result в нужном нам порядке
        Map<String, Integer> sortedMap = result.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        System.out.println(sortedMap);

        }

        // Можно сразу посчитать, сколько повторений имеет определенное значение в Map
        //  int count = Collections.frequency(new ArrayList<String>(map.values()), "Чичиков");
        //  System.out.println(count);


        // Чичиков 601
    }
