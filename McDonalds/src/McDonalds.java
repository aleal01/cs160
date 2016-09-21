// McDonalds Assignment
// Author: Aaron Leal
// Date:   Oct 8, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
public class McDonalds {

    // Enumerations
    public enum SodaFlavor { Nothing, Coke, Pepsi, Sprite };
    public enum SodaSize { Nothing, Small, Medium, Large };
    public enum Sandwich { Nothing, BigMac, QuarterPounder, FiletOfFish };
    public enum SideOrder { Nothing, FrenchFries, OnionRings };
    
    // Instance variables
    // Add requested variables!!!
    private SodaFlavor sodaFlavor;
    private SodaSize sodaSize;
    private Sandwich sandwich;
    private SideOrder side;
    // Constructor
    public McDonalds() {
        sodaFlavor = SodaFlavor.Nothing;
        sodaSize = SodaSize.Nothing;
        sandwich = Sandwich.Nothing;
        side = SideOrder.Nothing;
    }

    // Entry point with test code
    public static void main(String[] args) {
        
        McDonalds myMeal = new McDonalds();
        myMeal.chooseDrink(SodaFlavor.Coke, SodaSize.Medium);
        myMeal.chooseMeal(Sandwich.QuarterPounder, SideOrder.OnionRings);
        System.out.println(myMeal.toString());

        McDonalds specialMeal = new McDonalds();
        specialMeal.chooseDrink(SodaFlavor.Coke, SodaSize.Medium);
        specialMeal.chooseMeal(Sandwich.BigMac, SideOrder.FrenchFries);
        System.out.println(specialMeal.toString());

        McDonalds noDrink = new McDonalds();
        noDrink.chooseDrink(SodaFlavor.Nothing, SodaSize.Nothing);
        noDrink.chooseMeal(Sandwich.FiletOfFish, SideOrder.FrenchFries);
        System.out.println(noDrink.toString());
    }

    // Setters
    public void chooseDrink(SodaFlavor flavor, SodaSize size) {
    	sodaFlavor = flavor;
    	sodaSize = size;
        // Implement this method!!!
    }
    public void chooseMeal(Sandwich type, SideOrder order) {
        // Implement this method!!!
    	sandwich = type;
    	side = order;
    	
    }
    
    // Print order
    public String toString() {
        
        // Compute cost
        calculateCost();
        
        // Create output
        String s;

        // Add printing code!!!
        s = "Drink Flavor: " + sodaFlavor + "\n" + "Drink Size: " + sodaSize + "\n" 
        + "Sandwich Type: " + sandwich + "\n" + "Side Order: " + side + "\n" + "Cost of Order: $" + calculateCost() + "\n";
        
        return s;
    }
    
    // Calculate cost
    public double calculateCost() {

        double cost = 0.0;

        // Add special meal!!!
        if (sodaSize == sodaSize.Medium && sandwich == Sandwich.BigMac && side == SideOrder.FrenchFries )
        	return 4.39;
        // Compute soda cost
        switch (sodaSize) {
        case Small:  cost += 0.79; break;
        case Medium: cost += 0.99; break;
        case Large:  cost += 1.19; break;
        default:
        }
        
        // Compute sandwich cost
        switch (sandwich) {
        case BigMac: cost += 3.79; break;
        case QuarterPounder: cost += 4.09; break;
        case FiletOfFish: cost += 2.89; break;
        // Finish switch statement!!!
        
        default:
        }

        // Compute side cost
        if (side != SideOrder.Nothing) {
            cost += 1.59;
        }
        return cost;
    }
}