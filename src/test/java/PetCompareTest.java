import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 2/1/17.
 */
public class PetCompareTest {
    PetCompare aPC = new PetCompare();
    Dog aDog;
    Cat aCat;
    Cat bCat;
    Cow aCow;
    Cow bCow;

    @Before
    public void setUp() {
        aDog = new Dog();
        aCat = new Cat();
        bCat = new Cat();
        aCow = new Cow();
        bCow = new Cow();
        aDog.setName("Sparky");
        aCat.setName("Whiskers");
        bCat.setName("Whiskers");
        aCow.setName("Bessie");
        bCow.setName("Bertha");
    }

    @Test
    public void petCompareTest() {
        Assert.assertTrue(aPC.compare(aCow,bCow) > 0);
        Assert.assertTrue(aPC.compare(aCat,bCat) == 0);
        Assert.assertTrue(aPC.compare(aCat, aDog) < 0);

    }


}
