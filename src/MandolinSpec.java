import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MandolinSpec extends InstrumentSpec {


    public MandolinSpec(Builder Builder, String Model, Type Type, Wood BackWood, Wood TopWood) {
        super(Builder, Model, Type, BackWood, TopWood);
    }


    public boolean matches(MandolinSpec mandolinSpec) {
        if (mandolinSpec.getBuilder() != this.getBuilder())
            return false;

        String model = this.getModel().toLowerCase();
        if ((model != null) && (!model.equals("")) &&
                (!model.equals(mandolinSpec.getModel().toLowerCase())))
            return false;

        if (mandolinSpec.getType() != this.getType())
            return false;
        if (mandolinSpec.getBackWood() != this.getBackWood())
            return false;
        if (mandolinSpec.getTopWood() != this.getTopWood())
            return false;
        return true;
    }
}
