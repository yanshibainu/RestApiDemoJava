package tw.com.entities;

import java.util.Set;
import java.util.UUID;

import javax.persistence.*;

@Entity
public class User{
	@Id 
	private String id = UUID.randomUUID().toString();

	@Column(length = 15)
	private String name;

	@Column(length = 50)
	private String email;

	@Column(length = 15)
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Order> orders;


	public User() {
	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", orders=" + orders +
				'}';
	}
}
