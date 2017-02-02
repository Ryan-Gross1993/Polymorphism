import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ryangross on 2/1/17.
 */
public class PetTest {
    Dog aDog;
    Dog bDog;
    Cat aCat;
    ArrayList<Pet> test = new ArrayList<Pet>();

    @Before
    public void setUp() {
        aDog = new Dog();
        bDog = new Dog();
        aCat = new Cat();
        aDog.setName("Bobby");
        bDog.setName("Bobby");
        aCat.setName("Jimmy");
        test.add(aCat);
        test.add(aDog);
        test.add(bDog);
        Collections.sort(test);

    }

    @Test
    public void compareToTest() {
        Assert.assertEquals(0, aDog.compareTo(bDog));
        Assert.assertTrue(aCat.compareTo(bDog) > 1);
        

    }
}
