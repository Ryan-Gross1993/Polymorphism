import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.Collections;

>>>>>>> master
/**
 * Created by ryangross on 2/1/17.
 */
public class PetCompareTest {
    PetCompare aPC = new PetCompare();
<<<<<<< HEAD
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


=======
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



>>>>>>> master
}
