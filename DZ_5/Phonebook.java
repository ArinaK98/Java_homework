import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    static Map<String, List<String>> phonebook = new HashMap<>();
    /*
     * Реализуйте структуру телефонной книги с помощью HashMap, 
     * учитывая, что 1 человек может иметь несколько телефонов.
     */
    public static void main(String[] args) {
        addNote(phonebook, "Авилов", "9991368364");
        addNote(phonebook, "Богданов", "9966432419");
        addNote(phonebook, "Семнова", "9278524824");
        addNote(phonebook, "Богданов", "9521362484");
              
        System.out.println(findByName(phonebook, "богданов"));
    }

    static void addNote(Map<String, List<String>> map, String name, String number){
        if (map.containsKey(name)){
            List<String> list = map.get(name);
            list.add(number);
        } else {
            List<String> list = new ArrayList<>();
            list.add(number);
            map.put(name, list);
        }
    }
    
    static String findByName(Map<String, List<String>> map, String lastname){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry: map.entrySet()){
            String name = entry.getKey();
            List<String> number = entry.getValue();
            if (name.equalsIgnoreCase(lastname)){
                stringBuilder.append(name);
                stringBuilder.append(": ");
                stringBuilder.append(number);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
