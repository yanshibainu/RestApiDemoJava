package tw.com.entities;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.*;

@Entity
public class Shop implements Serializable {
	//private static final long serialVersionUID = 1L;

	@Id
	private String id = UUID.randomUUID().toString();

	@Column(length = 15)
	private String name;

	@Column(length = 50)
	private String address;

	@OneToMany(cascade = CascadeType.ALL/*,mappedBy = "shop"*/)
	private Set<Item> item;

	public Shop() {
	}

	public Shop(String name, String address) {
		this.name = name;
		this.address = address;
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
		return "Shop [id=" + id + ", name=" + name + ", address=" + address + ", item=" + item + "]";
	}

}
