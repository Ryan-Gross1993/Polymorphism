import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/31/17.
 */
public class PetFactoryTest {
    PetFactory aPF;

    @Before
    public void setUp() {
        aPF = new PetFactory();
    }

    @Test
    public void makePetTest() {
        Pet aPet = aPF.makeAPet("lorraine","cat");
        Assert.assertTrue(aPet.getClass().getSuperclass().getSimpleName().equals("Pet"));
    }

}
