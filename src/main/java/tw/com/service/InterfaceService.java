package tw.com.service;

import java.util.List;

import tw.com.entities.User;

public interface InterfaceService {

	public User add(User user);

	public List<User> getAll();
	public User getById(int id);

	public List<User> update(User user, int id);

	public List<User> delete(int id);
	
}
