package tw.com.service;

import org.springframework.stereotype.Service;

import tw.com.entities.User;

@Service
public class UserService extends AbstractService<User>{

	@Override
	public User create(User user) {
		user.setId(map.size());
		return super.create(user);
	}
	
}
