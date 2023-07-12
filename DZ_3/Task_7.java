package DZ_3;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
 * Вывести название каждой планеты и количество его повторений в списке. 
 * Collections.frequency(list, item)
 */

public class Task_7 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Марс");
        
        for (String planet : planets)
            System.out.println(planet + " = " + Collections.frequency(planets, planet));

    }
    
}
