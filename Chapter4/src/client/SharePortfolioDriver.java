package client;

import entity.SharePortfolio;
import java.util.*;

/**
 * * SharePortfolioDriver.java A driver that demonstrates the class SharePortfolio. 
 * * @author Frank M. Carrano, Kat Tan
 *   @version 3.0
 */
public class SharePortfolioDriver {

  public static void main(String[] args) {
    SharePortfolio myShares = new SharePortfolio();
    System.out.println("Buy 20 shares @RM45.00 each.");
    myShares.buy(20, 45);
    System.out.printf("Current portfolio has %d units with total capital RM%.2f\n",
            myShares.countTotalUnitShares(), myShares.getSharePortfolioCapital());

    System.out.println("\nBuy 20 shares @RM75.00 each.");
    myShares.buy(20, 75);
    System.out.printf("Current portfolio has %d units with total capital RM%.2f\n",
            myShares.countTotalUnitShares(), myShares.getSharePortfolioCapital());

    System.out.printf("\nSell 30 shares @RM65 each at a profit(loss) of RM%.2f\n", myShares.sell(30, 65));  // RM300    System.out.printf("Sell 10 shares @RM65 each at a profit(loss) of RM%.2f\n", myShares.sell(10, 65));  // RM300    System.out.println("\nBuy 100 shares @RM20.00 each.");    System.out.println("Buy 20 shares @RM24.00 each.");    System.out.println("Buy 200 shares @RM36.00 each.");    myShares.buy(100, 20);    myShares.buy(20, 24);    myShares.buy(200, 36);    System.out.printf("\nSell 10 shares @RM65.00 each at a profit(loss) of RM%.2f\n", myShares.sell(10, 65));  //  RM450    System.out.printf("Sell 150 shares @RM65.00 each at a profit(loss) of RM%.2f\n", myShares.sell(150, 30)); //  RM780    
    myShares.buy(20, 75);
  }
}
