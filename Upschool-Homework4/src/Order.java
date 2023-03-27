import java.util.List;

public class Order {
    private int orderId;
    private List<Album> orders;

    public Order(int orderId, List<Album> orders) {
        this.orderId = orderId;
        this.orders = orders;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Album> getOrders() {
        return orders;
    }

    public void setOrders(List<Album> orders) {
        this.orders = orders;
    }

    public void buyBasket(){
        System.out.println("Ürünler satın alındı.");
    }
}
