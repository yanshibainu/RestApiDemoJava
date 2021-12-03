package tw.com.entities;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.*;

@Entity
public class Item {
	@Id
	private String id = UUID.randomUUID().toString();

	@Column(length = 15)
	private String name;

	@Column()
	private Integer price;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shop_id")
	private Shop shop;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Order> orders;

	public Item() {
	}

	public Item(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
		return "Item{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", price=" + price +
				", shop=" + shop +
				", orders=" + orders +
				'}';
	}
}
