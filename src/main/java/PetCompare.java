import java.util.Comparator;

/**
 * Created by ryangross on 2/1/17.
 */
public class PetCompare implements Comparator<Pet> {

    public int compare(Pet aPet, Pet bPet) {
        if (aPet.getClass().getSimpleName().compareTo(bPet.getClass().getSimpleName()) == 0) {
            return (aPet.getName().compareTo(bPet.getName()));
        } else {
            return aPet.getClass().getSimpleName().compareTo(bPet.getClass().getSimpleName());
        }
    }
}
