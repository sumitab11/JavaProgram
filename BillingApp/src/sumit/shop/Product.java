package sumit.shop;

public class Product {
    public int getPrice() {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    private int price;

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    private String productName;

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    private int quantity;
}


