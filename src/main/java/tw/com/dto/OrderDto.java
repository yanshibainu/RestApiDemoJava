package tw.com.dto;

import tw.com.entities.Item;
import tw.com.entities.User;

import java.time.LocalDate;

public class OrderDto {
    private String user_id;
    private Integer amount;
    private String item_id;
    private LocalDate buyDate;
    private Integer orderNumber;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
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
                "user_id='" + user_id + '\'' +
                ", amount=" + amount +
                ", item_id='" + item_id + '\'' +
                ", buyDate=" + buyDate +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
