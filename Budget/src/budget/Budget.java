/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget;
import java.util.*;
/**
 *
 * @author Julian
 */
public class Budget {

    private String budgetName;
    public Budget(String budgetName){
        this.budgetName = budgetName;
        
       
}

    public String getBudgetName() {
        return budgetName;
    }

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }
    
    public Income addIncome(int amount,int frequency, String name){
    Income newIncome = new Income(amount, frequency, name);
    return newIncome;
    
        
    }
    
    public Expense addExpense(int amount, int frequency, String name){
    Expense newExpense = new Expense(amount, frequency, name);
    return newExpense;
    
        
    }
    
    public void getUserIncome(){
       
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Expense[] budgetExpenseArray = new Expense[100];
        Income[] budgetIncomeArray = new Income[100];
        String myBudgetName = "";
        int choice = 0;
        double amount = 0;
        int frequency = 0;
        String name = null;
        int incomeCount = 0;
        int expenseCount = 0;
        
        
        System.out.println("Insert Budget Name");
        Scanner scan1 = new Scanner(System.in);
        try{
        myBudgetName = scan1.nextLine();
        }catch (java.util.InputMismatchException e){
        scan1.nextLine();
        }
        
        Budget myBudget = new Budget(myBudgetName);
        
        
        int userInputting = 0;
        //Loop start here
        while(userInputting == 0){
        System.out.println("Would you like to add an income or expense?");
        System.out.println("Input 1 for Income");
        System.out.println("Input 2 for Expense");
        
        
       
        while(choice != 1 || choice != 2){
        try{
        choice = scan1.nextInt();
        
        if (choice == 1 || choice ==2){
        break;
                }
        System.out.println("Please input a valid integer (1 or 2)");
        
        }catch (java.util.InputMismatchException e){
        System.out.println("Please input a valid integer (1 or 2)");
        scan1.next();

    }
       }
        
        if(choice == 1){
        System.out.println("Please input income amount");
        
        while(true){
        try{
        
        amount = scan1.nextDouble();
        if(amount > 0){
        break;
        } else {
            System.out.println("Please input a valid amount");
            
        }
        
        }catch(java.util.InputMismatchException e){
            System.out.println("Please input a valid amount");
            scan1.next();
        }
        }
        
        
        System.out.println("Please input income Frequency per year (1 for once, 12 for monthly, etc.");
        while(true){
        try{
        frequency = scan1.nextInt();
        
        if (frequency > 0){
        break;
        } else {
            System.out.println("Please input a valid frequency");
        }
        
        }catch(java.util.InputMismatchException e){
            System.out.println("Please input a valid frequency");
            scan1.next();
           
        }
        }
        
        System.out.println("Please input income name");
        
        while(true){
        try{
        name = scan1.next();
        break;
        
        }catch (java.util.InputMismatchException e){
        scan1.next();
        }
        }
        Income thisIncome = new Income(amount, frequency, name);
        budgetIncomeArray[incomeCount] = thisIncome;
        System.out.println(thisIncome.getIncomeName());
        System.out.println(budgetIncomeArray[incomeCount].getIncomeAmount());
        incomeCount++;
        
        }
        
        if(choice == 2){
            System.out.println("Please input expense amount");
        
        while(true){
        try{
        amount = scan1.nextDouble();
        if(amount > 0){
        break;
        } else {
            System.out.println("Please input a valid amount");
            
        }
        }catch(java.util.InputMismatchException e){
            System.out.println("Please input a valid amount");
            scan1.next();
        }
        }
        
        
        System.out.println("Please input income Frequency per year (1 for once, 12 for monthly, etc.");
        while(true){
        try{
        frequency = scan1.nextInt();
        if (frequency > 0){
        break;
        } else {
            System.out.println("Please input a valid frequency");
        }
        }catch(java.util.InputMismatchException e){
            System.out.println("Please input a valid frequency");
            scan1.next();
            
        }
        }
        
        System.out.println("Please input expense name");
        
        while(true){
        try{
        name = scan1.next();
        break;
        
        }catch (java.util.InputMismatchException e){
        scan1.next();
        }
        }
        Expense thisExpense = new Expense(amount, frequency, name);
        budgetExpenseArray[expenseCount] = thisExpense;
        System.out.println(thisExpense.getExpenseName());
        System.out.println(budgetExpenseArray[expenseCount].getExpenseAmount());
        expenseCount++;
            
        }
        
        System.out.println("Would you like to add more incomes/expenses?");
        System.out.println("1 = yes");
        System.out.println("2 = no");
        while(true){
        try{
           int continueAdding = scan1.nextInt();
           if(continueAdding == 1){
           break;
           }
           if(continueAdding == 2){
           userInputting = 1;
           break;
           }
           System.out.println("Please input valid response (1 or 2)");
           
        }catch (java.util.InputMismatchException e){
        System.out.println("Please input valid response (1 or 2)");
        scan1.next();
        }
        }
        
        
        }
    
    System.out.println("//////Displaying Budget///////");
    System.out.println(myBudget.budgetName + ":");
    System.out.println();
    System.out.println("INCOMES:");
    int totalIncome = 0;
    int totalExpenses = 0;
    double calc = 0;
    
    
    for(int i = 0; i < incomeCount; i++){
    calc = (budgetIncomeArray[i].getIncomeAmount() * (double)budgetIncomeArray[i].getIncomeFrequency());
    System.out.println(budgetIncomeArray[i].getIncomeName() + ": $" + calc);
    totalIncome += calc;
    }
    System.out.println("Total income: $" + totalIncome);
    
    System.out.println();
    
    System.out.println("EXPENSES:");
    
    for(int i = 0; i < expenseCount; i++){
    calc = (budgetExpenseArray[i].getExpenseAmount() * (double)budgetExpenseArray[i].getExpenseFrequency());
    System.out.println(budgetExpenseArray[i].getExpenseName() + ": $" + calc);
    totalExpenses += calc;
    }
    System.out.println("Total expenses: $" + totalExpenses);
    
    System.out.println("//////////////////////////////");
    System.out.println("");
    System.out.println("Income - Expenses = $" + (totalIncome-totalExpenses));
    
 
        
        
}
}
