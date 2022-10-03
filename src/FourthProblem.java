import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FourthProblem {

    public void solarSystemAgain(){
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Плутон");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Уран");
        planets.add("Земля");
        planets.add("Плутон");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Меркурий");

        Iterator<String> iterator = planets.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (Collections.frequency(planets, next) > 1) {
                iterator.remove();
            }
        }
        System.out.println(planets);
    }
}
