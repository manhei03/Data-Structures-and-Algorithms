package entity;

/**
 * * SharePurchase.java An immutable class that represents the purchase of one
 * share of stock. * * @author Frank M. Carrano * @version 2.0
 */
public class SharePurchase {

  private double cost;

  public SharePurchase(double costPerShare) {
    cost = costPerShare;
  }

  public double getCostPerShare() {
    return cost;
  }
}
