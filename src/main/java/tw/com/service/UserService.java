package tw.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import tw.com.entities.User;

@Component
public class UserService {
	private static List<User> list = new ArrayList<>();
	
	static {
		list.add(new User(1, "AAA", "AAA@gmial.com", "12345"));
		list.add(new User(2, "BBB", "BBB@gmial.com", "12345"));
		list.add(new User(3, "CCC", "CCC@gmial.com", "12345"));
	}
	
	public List<User> getAllUser(){
		return list;
	}
	
	public User getUserById(int id) {
		User user = null;
		user = list.stream().filter(e->e.getId()==id).findFirst().get();
		return user;
	}
	
	public User addUser(User user) {
		list.add(user);
		return user;
	}
	
	public List<User> deleteUser(int id) {
		list.removeIf(e->e.getId()==id);
		return list;
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
		
		
		
		
		
		/*
		list.stream().map(e->{
			if(e.getId() == id) {
				e.setId(user.getId());
				e.setName(user.getName());
				e.setEmail(user.getEmail());
				e.setPassword(user.getPassword());
			}
			return e;
		}).collect(Collectors.toList());
		*/
		
		/*
		list = list.stream().filter(e->e.getId()==id).map(e->{
			e.setId(user.getId());
			e.setName(user.getName());
			e.setPassword(user.getPassword());
			return e;
		}).collect(Collectors.toList());
		 */
		/*
		for(User userr:list) {
			
			if(userr.getId() == id) {
				
				if(!"".equals(user.getName())) {
					userr.setName(user.getName());
				}
				if(!"".equals(user.getEmail())) {
					userr.setEmail(user.getEmail());
				}
				
				return userr;
			}
			
		}
		*/
	}
}
