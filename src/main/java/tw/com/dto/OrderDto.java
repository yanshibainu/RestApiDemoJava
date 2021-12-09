package tw.com.dto;

import tw.com.entities.Item;
import tw.com.entities.User;

import java.time.LocalDate;

public class OrderDto {
    private User user;
    private Integer amount;
    private Item item;
    private LocalDate buyDate;
    private Integer orderNumber;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user=" + user +
                ", amount=" + amount +
                ", item=" + item +
                ", buyDate=" + buyDate +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
