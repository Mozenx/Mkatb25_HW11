package ir.maktab25;


import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {

        List<Animal> animals = new ArrayList<>();

        for(int i = 1; i < 100; i++){

            animals.add(new Cat("cat"+i));
        }



    }
}
