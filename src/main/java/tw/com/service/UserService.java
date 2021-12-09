package tw.com.service;

import org.springframework.stereotype.Service;

import tw.com.dao.UserRepository;
import tw.com.entities.User;

@Service
public class UserService extends AbstractService<User>{

	public UserService(UserRepository userRepository) {
		super(userRepository);
	}

	@Override
	public User update(String id, User entity) {
		entity.setId(id);
		return super.update(id, entity);
	}

}
