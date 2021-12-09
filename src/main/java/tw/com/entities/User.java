package tw.com.entities;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.*;

@Entity
public class User implements Serializable {
	//private static final long serialVersionUID = 1L;

	@Id 
	private String id = UUID.randomUUID().toString();

	@Column(length = 15)
	private String name;

	@Column(length = 50)
	private String email;

	@Column(length = 15)
	private String password;

	@Column(length = 6)
	private String gender;

	@OneToMany(cascade = CascadeType.ALL/*, mappedBy = "user"*/)
	private Set<Order> orders;


	public User() {
	}

	public User(String name, String email, String password, String gender) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", gender='" + gender + '\'' +
				", orders=" + orders +
				'}';
	}
}
