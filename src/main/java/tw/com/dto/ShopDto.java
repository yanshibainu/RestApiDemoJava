package tw.com.dto;

import tw.com.entities.Item;

import java.util.Set;

public class ShopDto {
    private String name;
    private String address;
    private Set<Item> item;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Item> getItem() {
        return item;
    }

    public void setItem(Set<Item> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "ShopDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", item=" + item +
                '}';
    }
}
