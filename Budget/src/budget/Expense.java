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
public class Expense {
    private double expenseAmount;    
    private int expenseFrequency;
    private String expenseName;
    
    public Expense(double expenseAmount, int expenseFrequency, String expenseName){
        this.expenseAmount = expenseAmount;
        this.expenseFrequency = expenseFrequency;
        this.expenseName = expenseName;
       
}

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public int getExpenseFrequency() {
        return expenseFrequency;
    }

    public void setExpenseFrequency(int expenseFrequency) {
        this.expenseFrequency = expenseFrequency;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }
    
    
}
