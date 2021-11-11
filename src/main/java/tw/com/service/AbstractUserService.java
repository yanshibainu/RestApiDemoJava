package tw.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import tw.com.entities.User;

public abstract class AbstractUserService implements InterfaceService<User>{
	
	private static List<User> list = new ArrayList<>();
	
	static {
		list.add(new User(1, "AAA", "AAA@gmial.com", "12345"));
		list.add(new User(2, "BBB", "BBB@gmial.com", "12345"));
		list.add(new User(3, "CCC", "CCC@gmial.com", "12345"));
	}
	
	@Override
	public User add(User user) {
		list.add(user);
		return user;
	}
	
	@Override
	public List<User> getAll(){
		return list;
	}
	
	@Override
	public User getById(int id) {
		User user = null;
		user = list.stream().filter(e->e.getId()==id).findFirst().get();
		return user;
	}
	
	@Override
	public List<User> update(User user, int id) {
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
	
	@Override
	public List<User> delete(int id) {
		list.removeIf(e->e.getId()==id);
		return list;
	}
	
}
