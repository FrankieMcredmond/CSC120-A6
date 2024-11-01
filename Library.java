import java.util.Hashtable;
public class Library extends Building{
    private Hashtable<String, Boolean> collection;


    //Constructor

    /**
     * Constructs an instance of the Library class
     * @param name name of house
     * @param address address of house
     * @param nFloors number of floors of house
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      System.out.println("You have built a library: 📖");
      this.collection= new Hashtable<>();
    }

    //Getters

    public boolean containsTitle(String title){
      return (collection.containsKey(title));
    }

    public boolean isAvailable(String title){
      if (collection.containsKey(title)==true){
        return collection.get(title);}
      else{ return false;}
    }



    //Methods


    public void addTitle(String title){
      if (collection.containsKey(title)==false){
        collection.put(title, true);}
      else {
        System.out.println("title already found in collection");}}

    public String removeTitle(String title){
      if (collection.containsKey(title)==true){
        collection.remove(title);
        return (title+" has been removed from the collection");}
      else {
        return("title not found in collection");}
    }

    public void checkOut(String title){
      if (collection.containsKey(title)==true){
        if (collection.get(title)==true){
          collection.replace(title, true, false);}}
    }

    public void returnBook(String title){
      if (collection.containsKey(title)==true){
        if (collection.get(title)==false){
          collection.replace(title, false, true);}}
    }


    public void printCollection(){
      System.out.println("\n");
      System.out.println("Welcome to "+this.name+"! Here are the books in our Collection!\n");
      collection.forEach( (k, v) -> { 
        System.out.print(k);
        if (collection.get(k)== true){
          System.out.print(": available");}
        else {
          System.out.print(": not available");}
        System.out.println("\n");
        });
    }
    public static void main(String[] args) {
      Library Neilson= new Library("Neilson", "7 Neilson Drive, Northampton, MA 01063", 4);
      System.out.println(Neilson);
      Neilson.addTitle("Catcher and the rye");
      Neilson.addTitle("Junie B.Jones");
      Neilson.addTitle("Cat in the Hat");
      Neilson.addTitle("Wrinkle in Time");
      Neilson.removeTitle("Catcher and the rye");
      Neilson.checkOut("Cat in the Hat");
      Neilson.printCollection();
      System.out.println(Neilson.containsTitle("Catcher and the rye"));
      System.out.println(Neilson.isAvailable("Cat in the Hat"));
    }
  
  }