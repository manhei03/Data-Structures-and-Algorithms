/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fraction;

/**
 *
 * @author TARUC
 */
public interface FractionInterface {
    //abstract methods
    public void setNumerator(int numerator);
    public void setDenominator(int denominator);
    public int getNumerator();
    public int getDenominator();
    
    public FractionInterface add(FractionInterface frac1);    //Assignment can put Author Name here
    public FractionInterface subtract(FractionInterface frac1);
    public FractionInterface multiply(FractionInterface frac1);
    public FractionInterface divide(FractionInterface frac1);
    
    
}
