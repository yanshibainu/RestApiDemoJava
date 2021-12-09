package tw.com.dto;

import tw.com.entities.Order;
import tw.com.entities.Shop;

import java.util.Set;

public class ItemDto {
    private String name;
    private Integer price;
    private Shop shop;
    private Set<Order> orders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shop=" + shop +
                ", orders=" + orders +
                '}';
    }
}
