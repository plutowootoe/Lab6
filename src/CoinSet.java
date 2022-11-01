import java.util.ArrayList;

/**
 * A set of coins.
 */
public class CoinSet {
   private ArrayList<Coin> set;

   /**
    * Constructs a CoinSet object.
    */
   public CoinSet() {
      set = new ArrayList<Coin>();
   }

   // ADD REMAINING CODE HERE
   public void add(Coin coin) {
      set.add(coin);
   }

   public double total() {
      double sum = 0;
      for (int i = 0; i < set.size(); i++) {
         sum += set.get(i).getVal();
      }
      return sum;
   }

   public void clearCoins() {
      set.clear();
   }
}
