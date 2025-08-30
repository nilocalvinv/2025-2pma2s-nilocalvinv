package br.com.mariojp.solid.srp;

public class TaxCalculator {

    public double calculate(double amount) {
        String taxRateStr = System.getProperty("tax.rate", "0.10"); // default 10%
        double taxRate = Double.parseDouble(taxRateStr);
        return amount * taxRate;
    }
}
