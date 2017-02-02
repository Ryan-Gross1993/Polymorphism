
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryangross on 1/31/17.
 */
public class PetManagement {
    private List<Pet> allPets = new ArrayList<Pet>();


    public List<Pet> getAllPets() {
        return this.allPets;
    }


    public List addPetToList(Pet aPet) {
        getAllPets().add(aPet);
        return getAllPets();
    }

}
