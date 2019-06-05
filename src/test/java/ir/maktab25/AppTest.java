package ir.maktab25;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingSupplier;

import java.util.List;





/**
 * Unit test for simple App.
 */
public class AppTest 
{

    List<Cat> cats = App.createListOfCats();

    @Test
    void testCreateListOfCats(){
        Assertions.assertNotNull(cats);
        Assertions.assertDoesNotThrow((ThrowingSupplier<ArrayIndexOutOfBoundsException>) ArrayIndexOutOfBoundsException::new);
    }

    @Test
    void test
}