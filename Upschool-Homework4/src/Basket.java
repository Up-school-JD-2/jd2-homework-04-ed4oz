import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Album> products = new ArrayList<>();
    private int quantity;
    private double totalPrice;

    public Basket(List<Album> products, int quantity, double totalPrice) {
        this.products = products;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Basket() {
    }

    public List<Album> getProducts() {
        return products;
    }

    public void setProducts(List<Album> products) {
        this.products = products;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public void addToBasket(Album album) {
        this.products.add(album);
        System.out.println("Albüm sepete eklendi. Sepete eklenen albüm: " + album.getName());

    }

    public void removeFromBasket(Album album) {
        this.products.remove(album);
        System.out.println("Albüm sepetten çıkarıldı. Sepetten çıkarılan albüm: " + album.getName());

    }

    public void showBasket() {
        System.out.println("Sepetteki ürünler: ");
        int total = 0;
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ")" + "Albümün adı: " + products.get(i).getName() + " Şarkıcının adı: " + products.get(i).getSingerName() + " Albümün fiyatı: " + products.get(i).getPrice() + " TL");
            total += products.get(i).getPrice();
        }
        this.totalPrice = total;
        System.out.println("Sepetin Tutarı: " + this.totalPrice + " TL");
    }
}
