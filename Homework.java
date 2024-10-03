/**
 * Homework
 */
import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Homework run = new Homework();
        run.favClasses();
    }

    private void favClasses() {
        List<String> names = new ArrayList<>();
        names.add("Dawn Uler");
        names.add("James Been");
        names.add("Uma Rouery");
        names.add("Saint Bummber");
        
        List<String> classes = new ArrayList<>();
        classes.add("Science");
        classes.add("Math");
        classes.add("Art");
        classes.add("Music");

        Map<String, String> favoriteClass = new HashMap<>();

        Random random = new Random();

        for (String name : names) {
           int ranIndex = random.nextInt(classes.size());
           String favClass = classes.get(ranIndex);

           favoriteClass.put(name, favClass);
        }

        for (Map.Entry<String, String> string : favoriteClass.entrySet()) {
            System.out.println(string.getKey() + "'s favorite subject is " + string.getValue());
        }
    }
}