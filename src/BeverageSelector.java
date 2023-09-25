import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args){
        Dictionary<Integer, String> dict  = new Hashtable<>();
        dict.put(1, "Water");
        dict.put(2, "Coke");
        dict.put(3, "Coffee");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What beverage would you like?\n1) Water\n2) Coke\n3) Coffee");
        int response = scanner.nextInt();
        System.out.println("Great! You selected " + dict.get(response));
    }
}
