import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ryangross on 2/1/17.
 */
public class PetCompareTest {
    PetCompare aPC = new PetCompare();
    Cat aCat;
    Cat bCat;
    Cow aCow;


    @Before
    public void setUp() {
        aCat = new Cat();
        aCat.setName("Joe");
        bCat = new Cat();
        bCat.setName("Joe");
        aCow = new Cow();
        aCow.setName("Bobbert");
    }

    @Test
    public void compareTest() {
        Assert.assertEquals(aCat.getClass().getSimpleName().compareTo(aCow.getClass().getSimpleName()), aPC.compare(aCat, aCow));
    //    System.out.println(test.get(0).getClass().getSimpleName());
      //  System.out.println(test.get(1).getName());
      //  Assert.assertEquals(1, aPC.compare(bCow, aCat));
    }



}
