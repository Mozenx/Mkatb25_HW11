package ir.maktab25;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args ) {

        List<Cat> cats = createListOfCats();

        List<BreedType> catsFilter = filter(cats);

        catsFilter.forEach(System.out::println);

    }//end of main method

    //this method create list of cats
    public static List<Cat> createListOfCats(){
        List<Cat> animals = new ArrayList<>();

        for(int i = 0; i < 99; i++){

            Cat c = new Cat("cat"+(i+1));
            BreedType [] breeds = BreedType.values();
            c.setBreed(breeds[i]);
            animals.add(c);
        }
        return animals;
    }//end of createListOfCats method

    //this method filter list of cats
    public static List<BreedType> filter(List<Cat> cats){

        List<BreedType> result = cats.stream()
                .filter(cat -> cat.getBreed().startsWith("A") || cat.getBreed().startsWith("C") || cat.getBreed().startsWith("P"))//step one
                .filter(cat -> new Integer(cat.getName().substring(3))%2 == 0)//step two
                .map(cat -> cat.getBreedInBreedType())//step three
                .collect(Collectors.toList());//step four
        return result;
    }//end of filter method
    
}//end of class
