package main.store;

import java.util.ArrayList;


public class Seller {
    private int savingsAccount;
    private int directSalesAccount;
    ArrayList<Seller> sellers = new ArrayList<>();
    
    
    public int getSavingsAccount() {
        return this.savingsAccount;
    }
    
    public void setSavingsAccount(int savingsAccount) {
        this.savingsAccount = savingsAccount;
    }
    
    public int getDirectSalesAccount() {
        return this.directSalesAccount;
    }
    
    public void setDirectSalesAccount(int directSalesAccount) {
        this.directSalesAccount = directSalesAccount;
    }
    
    public void sale(int productPrice) {
        this.directSalesAccount += productPrice;
    }
    
    public void hireSeller(Seller newSeller) {
        sellers.add(newSeller);
    }
    
     
    public int collectProfit() {
       int sum = this.getDirectSalesAccount();
       for (int i = 0; i < this.sellers.size(); i++) {
          Seller sellerDependent = this.sellers.get(i);
          sum  = sum + sellerDependent.collectProfit();
       }
       this.setSavingsAccount((int)(sum * (60.0f/100.0f)));
       this.setDirectSalesAccount(0);
       
       int rest = sum - this.getSavingsAccount();
       return rest;
   }
   
}
