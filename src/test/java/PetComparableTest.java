import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ryangross on 2/1/17.
 */
public class PetComparableTest {
    Cat aCat;
    Dog aDog;
    Cow aCow;
    ArrayList<Pet> test = new ArrayList();

    @Before
    public void setUp() {
        aCow = new Cow();
        aCat = new Cat();
        aDog = new Dog();
        aDog.setName("Bobby");
        aCow.setName("Bobby");
        aCat.setName("Paul");
        test.add(aCow);
        test.add(aCat);
        test.add(aDog);
        Collections.sort(test);
    }


    @Test
    public void compareToTest() {
        Assert.assertEquals(aCow, test.get(0));
    }
}
