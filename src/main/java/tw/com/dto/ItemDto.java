package tw.com.dto;

import tw.com.entities.Order;
import tw.com.entities.Shop;

import java.util.Set;

public class ItemDto {
    private String name;
    private Integer price;
    private String shop_id;

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

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shop_id='" + shop_id + '\'' +
                '}';
    }
}
