package tw.com.service;

import java.util.List;

import tw.com.entities.User;

public interface InterfaceUserService {

	public User addUser(User user);

	public List<User> getAllUser();
	public User getUserById(int id);

	public List<User> updateUser(User user, int id);

	public List<User> deleteUser(int id);
	
}
