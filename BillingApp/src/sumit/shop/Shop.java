package sumit.shop;


import java.util.Arrays;

public class Shop{
    int grantTotal;

    public void calBill(Customer cust, Product... p) {
        System.out.println("Customer Details:");
        System.out.println(cust.getName() + "\t" + cust.getAddress() + "\t" + cust.getContact());
        for (int i = 0; i < p.length; i++) {
            int total = p[i].getQuantity() * p[i].getPrice();
            System.out.println(p[i].getProductName()+"\t"+p[i].getPrice()+"\t"+p[i].getQuantity()+"\t"+total);
            grantTotal =grantTotal+total;


        }
        System.out.println("Grant Total:"+grantTotal);
    }
}