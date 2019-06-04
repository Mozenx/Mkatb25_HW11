package ir.maktab25;


import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {

        List<Animal> a = new ArrayList<>();

        for(int i = 0; i < 99; i++){

            Cat c = new Cat("cat"+(i+1));
            BreedType [] breeds = BreedType.values();
            c.setBreed(breeds[i]);
            a.add(c);
        }
    }
}
