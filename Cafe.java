public class Cafe extends Building{

    //Attributes
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory


    //Constructor

    /**
     * Constructs an instance of the Cafe class
     * @param name name of house
     * @param address address of house
     * @param nFloors number of floors of house
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces=20;
        this.nSugarPackets=20;
        this.nCreams=20;
        this.nCups=20;
    }

    //Methods


    /**
     * Sells an order of coffee/ reduces inventory stock
     * @param size number of coffee ground units in coffee order
     * @param nSugarPackets number of sugar packets in coffee order
     * @param nCreams number of creams in coffee order
     * notes: This method can call the restock method
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if ((this.nCoffeeOunces-=size)<=0){restock(20, 0, 0, 0);}
        if ((this.nSugarPackets-=nSugarPackets)<=0){restock(0, 20, 0, 0);}
        if ((this.nCreams-=nCreams)<=0){restock(0, 0, 20, 0);}
        if ((this.nCups-=1)<=0){restock(0, 0, 0, 5);}
        this.nCoffeeOunces-=size;
        this.nSugarPackets-=nSugarPackets;
        this.nCreams-=nCreams;
        this.nCups-=1;
        System.out.println("Here's your order! One size "+size+" coffee with "+nSugarPackets+" sugars and "+nCreams+" creams");
            }

    /**
     * Restocks cafe inventory
     * @param size number of coffee ground units to restock
     * @param nSugarPackets number of sugar packets to restock
     * @param nCreams number of creams to restock
     * @param nCups number of cups to restock
     */    
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        System.out.println("Restocking...");
        this.nCoffeeOunces+=nCoffeeOunces;
        this.nSugarPackets+=nSugarPackets;
        this.nCreams+=nCreams;
        this.nCups+= nCups;
    }
    
    public static void main(String[] args) {
        Cafe Compass= new Cafe("compass", "7 Elm St, Northampton, MA 01063", 1);
        System.out.println(Compass);
        Compass.sellCoffee(12, 5, 5);
        Compass.sellCoffee(12, 5, 5);
        
    }
    
}
