package tw.com.entities;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    //private static final long serialVersionUID = 1L;

    @Id
    private String id = UUID.randomUUID().toString();

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE)
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

    public void setUser(User user) {
        this.user = user;
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
                ", user=" + user +
                ", item=" + item +
                ", amount=" + amount +
                ", buyDate=" + buyDate +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
