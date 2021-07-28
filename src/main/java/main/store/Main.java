package main.store;


public class Main {

    
    public static void main(String[] args) {
        
        Director director = new Director();
        Seller seller_1 = new Seller();
        
        Seller seller_2 = new Seller();
        Seller seller_3 = new Seller();
        Seller seller_4 = new Seller();
        Seller seller_5 = new Seller();
        Seller seller_6 = new Seller();
        Seller seller_7 = new Seller();
        Seller seller_8 = new Seller();
        Seller seller_9 = new Seller();
        Seller seller_10 = new Seller();
        
        director.hireSeller(seller_1);
        director.hireSeller(seller_2);
        director.hireSeller(seller_3);
        
        seller_1.hireSeller(seller_4);
        seller_1.hireSeller(seller_5);
        seller_1.hireSeller(seller_6);
        seller_1.hireSeller(seller_7);
        
        seller_2.hireSeller(seller_8);
        seller_2.hireSeller(seller_9);
        seller_2.hireSeller(seller_10);
        
        
//        for (int i = 0; i < director.sellers.size(); i++) {
//            System.out.println(director.sellers.get(i));
//        }
        
        seller_1.sale(10);
        seller_2.sale(10);
        seller_3.sale(10);
        
        seller_4.sale(10);
        seller_5.sale(10);
        seller_6.sale(10);
        seller_7.sale(10);
        seller_8.sale(10);
        seller_9.sale(10);
        seller_10.sale(10);

        director.sale(10);
        
        director.collectProfit();
        // System.out.println(director.collectProfit());
        
        System.out.println("seller_1 " + seller_1.getSavingsAccount() + " seller_2 " + seller_2.getSavingsAccount() + " seller_3 " + seller_3.getSavingsAccount() + " seller_4 " +  seller_4.getSavingsAccount());
        System.out.println("director " + director.getSavingsAccount());
        System.out.println("seller_1 " + seller_1.getDirectSalesAccount() + " seller_4 " + seller_4.getDirectSalesAccount());
        System.out.println("director " + director.getDirectSalesAccount());
    }
    
}
