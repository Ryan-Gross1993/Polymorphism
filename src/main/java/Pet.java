import java.util.Comparator;

/**
 * Created by ryangross on 1/31/17.
 */
public abstract class Pet implements Comparable<Pet> {
    private String aName;

    public abstract String speak();

    public String getName() {
        return this.aName;
    }

    public void setName(String aName) {
        this.aName = aName;
    }

<<<<<<< HEAD
=======
    // 1 is listed before, -1 is listed after

    @Override
>>>>>>> master
    public int compareTo(Pet aPet) {
        if (this.getName().compareTo(aPet.getName()) == 0) {
            return this.getClass().getSimpleName().compareTo(aPet.getClass().getSimpleName());
        } else {
            return this.getName().compareTo(aPet.getName());
        }
    }


}
