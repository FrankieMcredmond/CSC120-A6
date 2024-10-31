
import java.util.ArrayList;

public class House extends Building{

  //attributes

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  // constructor


  /**
     * Constructs an instance of the House class
     * @param name name of house
     * @param address address of house
     * @param nFloors number of floors of house
     * @param hasDiningRoom T/F whether house has a dining room
     */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom=hasDiningRoom;
    this.residents= new ArrayList<>();
    System.out.println("You have built a house: 🏠");}
    

  //Getters


    /**
     * answers whether an instance of the house class has a dining room
     * @return T/F: whether house has dining room
     */
  public boolean hasDiningRoom(){
    return (hasDiningRoom);}

    /**
     * answers size of house roster
     * @return length of array list called residents
     */
  public int nResidents(){
    return residents.size();}

    /**
     * answers size of house roster
     * @return length of array list called residents
     */
  public boolean isResident(String person){
    return residents.contains(person);
  }

  //Setters


  /**
     * adds resident to resident array list
     * @param name
     */
  public void moveIn(String name){
    residents.add(name);
  }

  /**
     * Removes resident from resident array list
     * @param name
     */
  public String moveOut(String name){
    if (residents.contains(name)==true){
      residents.remove(name);
      return name;
    }
    else{
      return ("House roster doesn't contain "+ name);} }

  



  public static void main(String[] args) {
    House morris= new House("Morris", "101 Green Street Northampton, MA 01063", 4, false);
    System.out.println(morris);
    morris.moveIn("Frankie");
    morris.moveIn("Sarah");
    morris.moveIn("Ange");
    morris.moveIn("Alex");
    System.out.println(morris.moveOut("Frankie"));
    System.out.println(morris.isResident("Frankie"));
    System.out.println(morris.moveOut("Frankie"));
  }

}