package tw.com.entities;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Order {
	@Id
	private String id = UUID.randomUUID().toString();
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Item> item;
	@Column(name = "數量")
	private Integer amout;
	@Column(name = "購買日期")
	private LocalDate buyDate;
	@Column(name = "訂單編號")
	private Integer orderNunber;
	
	
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
	public Set<Item> getItem() {
		return item;
	}
	public void setItem(Set<Item> item) {
		this.item = item;
	}
	public Integer getAmout() {
		return amout;
	}
	public void setAmout(Integer amout) {
		this.amout = amout;
	}
	public LocalDate getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(LocalDate buyDate) {
		this.buyDate = buyDate;
	}
	public Integer getOrderNunber() {
		return orderNunber;
	}
	public void setOrderNunber(Integer orderNunber) {
		this.orderNunber = orderNunber;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", item=" + item + ", amout=" + amout + ", buyDate=" + buyDate
				+ ", orderNunber=" + orderNunber + "]";
	}

}
