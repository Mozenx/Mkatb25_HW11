package ir.maktab25;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args ) {

        List<Cat> a = new ArrayList<>();

        for(int i = 0; i < 99; i++){

            Cat c = new Cat("cat"+(i+1));
            BreedType [] breeds = BreedType.values();
            c.setBreed(breeds[i]);
            a.add(c);
        }

        List<Animal> r = a.stream()
                .filter(a2 -> a2.getBreed().startsWith("A") || a2.getBreed().startsWith("C") || a2.getBreed().startsWith("P"))
                .collect(Collectors.toList());
        

        r.forEach(System.out::println);
    }
}
