/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

/**
 *
 * @author TARUC
 */
public class Fraction implements FractionInterface{
    private int numerator;
    private int denominator;

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }
    
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
    
    @Override
    public FractionInterface add(FractionInterface frac1){
        Fraction result = new Fraction();
        result.numerator = numerator * frac1.getDenominator()
                          + denominator * frac1.getNumerator();
        result.denominator = denominator * frac1.getDenominator();
        return result;
    }
    
    @Override
    public FractionInterface subtract(FractionInterface frac1){
        Fraction result = new Fraction();
        result.numerator = numerator * frac1.getDenominator()
                          - denominator * frac1.getNumerator();
        result.denominator = denominator * frac1.getDenominator();
        return result;
    }
    
    @Override
    public FractionInterface multiply(FractionInterface frac1){
        Fraction result = new Fraction();
        result.numerator = numerator * frac1.getNumerator();
        result.denominator = denominator * frac1.getDenominator();
        return result;
    }
    
    @Override
    public FractionInterface divide(FractionInterface frac1){
       //if(frac1.getNumerator()!=0 && frac1.getDenominator()!=0){
        Fraction result = new Fraction();
        result.numerator = numerator * frac1.getDenominator();
        result.denominator = denominator * frac1.getNumerator();
        return result;
       
    }
    
    
}
