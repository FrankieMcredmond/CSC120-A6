import java.util.Hashtable;
public class Library extends Building{
    private Hashtable<String, boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      System.out.println("You have built a library: 📖");
      this.catalog= new Hashtable<String, boolean>();
    }
  
    public static void main(String[] args) {
      new Library("Main Library", "7 Neilson Drive, Northampton, MA 01063", 4);
    }
  
  }