/**
 * Created by ryangross on 1/31/17.
 */
public abstract class Pet {
    private String aName;

    public abstract String speak();

    public String getName() {
        return this.aName;
    }

    public void setName(String aName) {
        this.aName = aName;
    }


}
