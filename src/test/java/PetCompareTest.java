import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;


public class PetCompareTest {
    PetCompare aPC = new PetCompare();
    Dog aDog;
    Cat aCat;
    Cat bCat;
    Cow aCow;
    Cow bCow;

    @Before
    public void setUp() {
        aCat = new Cat();
        aCat.setName("Joe");
        bCat = new Cat();
        aDog = new Dog();
        bCat.setName("Joe");
        aCow = new Cow();
        bCow = new Cow();
        aCow.setName("Bobbert");
        bCow.setName("Bessie");
        aDog.setName("Sparky");
    }

    @Test
    public void petCompareTest() {
        Assert.assertTrue(aPC.compare(aCow, bCow) > 0);
        Assert.assertTrue(aPC.compare(aCat, bCat) == 0);
        Assert.assertTrue(aPC.compare(aCat, aDog) < 0);

    }




    @Test
    public void compareTest() {
        Assert.assertEquals(aCat.getClass().getSimpleName().compareTo(aCow.getClass().getSimpleName()), aPC.compare(aCat, aCow));
        //    System.out.println(test.get(0).getClass().getSimpleName());
        //  System.out.println(test.get(1).getName());
        //  Assert.assertEquals(1, aPC.compare(bCow, aCat));
    }


}