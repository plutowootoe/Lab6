import java.lang.reflect.Array;
import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;

/**
 * A vending machine.
 */
public class VendingMachine {
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;

   /**
    * Constructs a VendingMachine object.
    */
   public VendingMachine() {
      products = new ArrayList<Product>();
      coins = new CoinSet();
      currentCoins = new CoinSet();
   }

   public Product[] getProductTypes() {
      ArrayList<Product> FilteredList = new ArrayList<>();

      for (int i = 0; i < products.size(); i++) {
         if (!FilteredList.contains(products.get(i))) {
            FilteredList.add(products.get(i));
         }

      }
      Product[] FilteredProduct = FilteredList.toArray(new Product[FilteredList.size()]);
      return FilteredProduct;
   }

   public void addCoin(Coin coin) {
      currentCoins.add(coin);
   }

   public double removeMoney() {
      double coinTotal = coins.total();
      coins.clearCoins();
      return coinTotal;
   }

   }

   public void buyProduct() {
      // Check if currentcoins = product value
      // if not give coins back
      // remove product from arraylist
      // add current coins to coinset if
   }

   public void addProduct() {
      // i = quanity for adding products
      // add product to products arraylist
      //
   }
}