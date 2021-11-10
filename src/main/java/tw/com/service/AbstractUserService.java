package tw.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import tw.com.entities.User;

public abstract class AbstractUserService implements InterfaceUserService{
	
	private static List<User> list = new ArrayList<>();
	
	static {
		list.add(new User(1, "AAA", "AAA@gmial.com", "12345"));
		list.add(new User(2, "BBB", "BBB@gmial.com", "12345"));
		list.add(new User(3, "CCC", "CCC@gmial.com", "12345"));
	}
	
	public User addUser(User user) {
		list.add(user);
		return user;
	}
	
	public List<User> getAllUser(){
		return list;
	}
	
	public User getUserById(int id) {
		User user = null;
		user = list.stream().filter(e->e.getId()==id).findFirst().get();
		return user;
	}
	
	public List<User> updateUser(User user, int id) {
		list.stream().map(e->{
			if(e.getId() == id) {
				if(e.getId() != user.getId()) {
					if(user.getId() != 0)
					e.setId(user.getId());
				}
				if(!e.getName().equals(user.getName())) {
					if(user.getName() != null)
						e.setName(user.getName());
				}
				if(!e.getEmail().equals(user.getEmail())) {
					if(user.getEmail() != null)
						e.setEmail(user.getEmail());
				}
				if(!e.getPassword().equals(user.getPassword())) {
					if(user.getPassword() != null)
						e.setPassword(user.getPassword());
				}
			}
			return e;
		}).collect(Collectors.toList());
		return list;	
	}
	
	public List<User> deleteUser(int id) {
		list.removeIf(e->e.getId()==id);
		return list;
	}
	
}
