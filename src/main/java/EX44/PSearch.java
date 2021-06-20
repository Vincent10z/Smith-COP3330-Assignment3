package EX44;
import java.util.*;

public class PSearch {
    private final static Scanner Userinput = new Scanner(System.in);

    public boolean inInventory (Products product, String name) throws IndexOutOfBoundsException{
        return Objects.equals(product.pName.toLowerCase(Locale.ROOT), name.toLowerCase(Locale.ROOT));
    }

    public String printSearch (List<Products> pList, String name) throws IndexOutOfBoundsException {
        String result = null;
        Iterator<Products> iterator = pList.iterator();
        while (true) {
            if (!iterator.hasNext()) return result;
            Products i = iterator.next();
            if (inInventory(i, name))
                result = "Name: " + i.pName + "\nPrice: " + i.pPrice + "\nQuantity: " + i.pQuantity;
        }
    }

    public String search (List<Products> pList) {
        String name = null;
        int i = 0;
        while (i == 0) {
            System.out.print("What is the product name? ");
            name = Userinput.nextLine();
            for (Products j : pList) {
                if (!inInventory(j, name)) {
                    continue;
                }
                i = 1;
            }
            if (i == 0) {
                System.out.println("Sorry, that product was not found in our inventory");
            }
        }
        return name.toLowerCase(Locale.ROOT);
    }
}

