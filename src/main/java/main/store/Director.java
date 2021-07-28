package main.store;


public class Director extends Seller {
    
    
    @Override
    public int collectProfit() {
               int sum = this.getDirectSalesAccount();
        for(Seller seller:sellers) {
            
            sum = sum + seller.collectProfit();
        }
        this.setSavingsAccount(sum);
        this.setDirectSalesAccount(0);
        return sum;
   }
    
    
    
}
