package sumit.shop;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shop s = new Shop();
        Customer cust = new Customer();
        cust.setName("sumit");
        cust.setAddress("abc");
        cust.setContact("12345");

        Product p1 = new Product();
        p1.setPrice(10);
        p1.setQuantity(10);
        p1.setProductName("prale G");

        Product p2 = new Product();
        p2.setProductName("dairy milk");
        p2.setPrice(10);
        p2.setQuantity(10);
        s.calBill(cust,p1,p2);

    }
}
