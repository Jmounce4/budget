/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget;

/**
 *
 * @author Julian
 */
public class Income {
    private double incomeAmount;
    private int incomeFrequency;
    private String incomeName;
    
    public Income(double incomeAmount, int incomeFrequency, String incomeName){
        this.incomeAmount = incomeAmount;
        this.incomeFrequency = incomeFrequency;
        this.incomeName = incomeName;
       
}

    public double getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(double incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public int getIncomeFrequency() {
        return incomeFrequency;
    }

    public void setIncomeFrequency(int incomeFrequency) {
        this.incomeFrequency = incomeFrequency;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }
    
    
}
