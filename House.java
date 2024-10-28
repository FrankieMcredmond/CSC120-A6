/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom=hasDiningRoom;
    this.residents= new ArrayList<>();
    System.out.println("You have built a house: 🏠");}
    
  public boolean hasDiningRoom(){
    return (hasDiningRoom);}

  public int nResidents(){
    return residents.size();}


  public void moveIn(String name){
    residents.add(name);
  }

  public String moveOut(String name){
    residents.remove(name);
    return name;}

  public boolean isResident(String person){
    return residents.contains(person);
  }
  public static void main(String[] args) {
    House morris= new House("Morris", "101 Green Street Northampton, MA 01063", 4, false);
    System.out.println(morris);
    morris.moveIn("Frankie");
    morris.moveIn("Sarah");
    morris.moveIn("Ange");
    morris.moveIn("Alex");
    System.out.println(morris.moveOut("Frankie"));
    System.out.println(morris.isResident("Frankie"));
  }

}