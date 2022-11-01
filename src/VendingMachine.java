import java.util.ArrayList;

/**
 * A vending machine.
 */
public class VendingMachine {
   private final ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;

   /**
    * Constructs a VendingMachine object.
    */
   public VendingMachine() {
      products = new ArrayList<>();
      coins = new CoinSet();
      currentCoins = new CoinSet();
   }

   public Product[] getProductTypes() {
      ArrayList<Product> FilteredList = new ArrayList<>();

      for (Product product : products) {
         if (!FilteredList.contains(product)) {
            FilteredList.add(product);
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
      System.out.println(coinTotal);
      return coinTotal;
   }



   public void buyProduct(Product p) {
      // Check if currentcoins = product value
      // if not give coins back
      // remove product from arraylist
      // add current coins to coinset if
         if(currentCoins.total() >= p.getPrice()) {
            products.remove(p);
            System.out.println("Purchased: " + p);

         }
         else{
               System.out.println("Not Enough Money Entered");
                }
      return;
   }

   public void addProduct(Product p, int quantity) {
      // i = quanity for adding products
      // add product to products arraylist
      for(quantity = 0;quantity<products.size();quantity++){
         products.add(p);
      }
      return;
   }
}