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

    // 1 is listed before, -1 is listed after

    @Override
    public int compareTo(Pet aPet) {
        if (this.getName().compareTo(aPet.getName()) == 0) {
            return this.getClass().getSimpleName().compareTo(aPet.getClass().getSimpleName());
        } else {
            return this.getName().compareTo(aPet.getName());
        }
    }


}
