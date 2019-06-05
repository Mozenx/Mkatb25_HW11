package ir.maktab25;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingSupplier;

import java.util.ArrayList;
import java.util.List;





/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    void testCreateListOfCats(){

        List<Cat> cats = App.createListOfCats();
        Assertions.assertNotNull(cats);
        Assertions.assertDoesNotThrow((ThrowingSupplier<ArrayIndexOutOfBoundsException>) ArrayIndexOutOfBoundsException::new);
    }

    @Test
    void testFilterCats(){
        List<Cat> cats = App.createListOfCats();

        BreedType [] breedTypes = {BreedType.Aegean, BreedType.American_Curl, BreedType.American_Wirehair, BreedType.Arabian_Mau,
        BreedType.Asian_Semilonghair, BreedType.Chantilly_Tiffany, BreedType.Chausie, BreedType.Colorpoint_Shorthair,BreedType.Cymric,
        BreedType.Persian_Modern, BreedType.Peterbald};

        Assertions.assertArrayEquals(breedTypes, App.filterCats(cats).toArray());
        Assertions.assertNotNull(App.filterCats(cats));

    }
}