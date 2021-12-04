package tw.com.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    private String id = UUID.randomUUID().toString();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "item_price", referencedColumnName = "price"),
            @JoinColumn(name = "item_id", referencedColumnName = "id")})
    private Item item;

    @Column
    private Integer amount;

    @Column
    private LocalDate buyDate;

    @Column
    private Integer orderNumber;


    public Order() {
    }

    public Order(Integer amount, LocalDate buyDate, Integer orderNumber) {
        this.amount = amount;
        this.buyDate = buyDate;
        this.orderNumber = orderNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User userId) {
        this.user = userId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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
        return "Order{" +
                "id='" + id + '\'' +
                ", userId=" + user +
                ", item=" + item +
                ", amount=" + amount +
                ", buyDate=" + buyDate +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
