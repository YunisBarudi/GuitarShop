import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GuitarSpec extends InstrumentSpec {

    private GuitarString guitarString;

    public GuitarSpec(Builder Builder, String Model, Type Type, Wood BackWood, Wood TopWood, GuitarString GuitarString) {
        super(Builder, Model, Type, BackWood, TopWood);
        guitarString = GuitarString;
    }

    public GuitarString getGuitarString(){
        return guitarString;
    }
    public boolean matches(GuitarSpec searchSpec) {
           if (searchSpec.getBuilder() != this.getBuilder())
                return false;

            String model = super.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(searchSpec.getModel().toLowerCase())))
                return false;

            if (searchSpec.getType() != this.getType())
                return false;
            if (searchSpec.getBackWood() != this.getBackWood())
                return false;
            if (searchSpec.getTopWood() != this.getTopWood())
                return false;
            return true;
    }
}
