/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces=20;
        this.nSugarPackets=20;
        this.nCreams=20;
        this.nCups=20;

    }
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        System.out.println("Preparing your order....");
        if ((this.nCoffeeOunces-=size)<=0){
            System.out.println("Sorry we don't have enough coffee grounds for your order");
            this.restock(20, 5, 5, 1);
        }
        else if((this.nSugarPackets-=nSugarPackets)<=0){
            System.out.println("Sorry we don't have enough sugar for your order");
            this.restock(5, 20, 5, 1);
        }
        else if((this.nCreams-=nCreams)<=0){
            System.out.println("Sorry we don't have enough cream for your order");
            this.restock(5, 5, 20, 1);
        }
        else if ((this.nCups-=1)<=0){
            System.out.println("Sorry we don't have enough cups for your order");
            this.restock(5, 5, 5, 5);
        }
        else{
            this.nCoffeeOunces-=size;
            this.nSugarPackets-=nSugarPackets;
            this.nCreams-=nCreams;
            this.nCups-=1;
            System.out.println("Here's your order! One size "+size+" coffee with "+nSugarPackets+" sugars and "+nCreams+" creams");}
    }

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
