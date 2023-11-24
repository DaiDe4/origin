package z28;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = createMap();

        int NameF = getFirstNameCount(personMap);
        int NameC = getLastNameCount(personMap);

        System.out.println("Количество людей с одинаковыми именами: " + NameF);
        System.out.println("Количество людей с одинаковыми фамилиями: " + NameC);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Литвинов", "Михаил");
        map.put("Галай", "Григорий");
        map.put("Грейерат", "Анна");
        map.put("Козлова", "Анна");
        map.put("Бадык", "Александр");
        map.put("Попова", "Евгения");
        map.put("Петренко", "Мария");
        map.put("Горшенёв", "Михаил");
        map.put("Князев", "Андрей");
        map.put("Смирнова", "Мария");
        return map;
    }

    public static int getFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCountMap = new HashMap<>();
        for (String value : map.values()) {
            firstNameCountMap.put(value, firstNameCountMap.getOrDefault(value, 0) + 1);
        }

        int count = 0;
        for (int valueCount : firstNameCountMap.values()) {
            if (valueCount > 1) {
                count += valueCount;
            }
        }
        return count;
    }

    public static int getLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCountMap = new HashMap<>();
        for (String key : map.keySet()) {
            lastNameCountMap.put(key, lastNameCountMap.getOrDefault(key, 0) + 1);
        }

        int count = 0;
        for (int keyCount : lastNameCountMap.values()) {
            if (keyCount > 1) {
                count += keyCount;
            }
        }
        return count;
    }
}

