import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec (Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC, Wood.ALDER,Wood.ALDER,GuitarString.FIVE);

        List matchingGuitars = inventory.search(whatLookingFor);
        displayMatches(matchingGuitars);
    }

    public static void displayMatches(List matchingGuitars){
        if (!matchingGuitars.isEmpty()){
            System.out.println("You might like these: ");

            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ){
                Guitar guitar = (Guitar)i.next();
                System.out.println("We have a " + guitar.getSpec().getBuilder() +
                        " " + guitar.getSpec().getModel() + " " +
                        guitar.getSpec().getType() + " guitar: " +
                        guitar.getPrice());
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }
    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        GuitarSpec spec1 = new GuitarSpec (Builder.FENDER     ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,
                GuitarString.FIVE);
        GuitarSpec spec2 = new GuitarSpec (Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.CEDAR,
                Wood.ALDER,
                GuitarString.FIVE);

        inventory.addGuitar("V00001",
                1499.99, spec1);
        inventory.addGuitar("V00002",
                1199.99,spec2);
        inventory.addGuitar("V00003",
                1699.99,
                spec1);
    }

}
