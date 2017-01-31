import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/31/17.
 */
public class PetManagementTest {
    PetManagement aPM;

    @Before
    public void setUp() {
        aPM = new PetManagement();
    }


    @Test
    public void addPetToListTest() {
        Cat aCat = new Cat();
        aPM.addPetToList(aCat);
        Assert.assertEquals(1, aPM.getAllPets().size());
    }
}
