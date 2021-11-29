package tw.com.entities;

import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shop {
	@Id
	private String id = UUID.randomUUID().toString();
	@Column(name = "商店")
	private String name;
	@Column(name = "地址")
	private String address;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Item> item;
	
	
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
