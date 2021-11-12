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

	@Override
	public User update(int id, User user) {
		if(map.get(id).getId() != user.getId() ) {
			user.setId(map.get(id).getId());
		}
		if(user.getName() == null) {
			user.setName(map.get(id).getName());
		}
		if(user.getEmail() == null) {
			user.setEmail(map.get(id).getEmail());
		}
		if(user.getPassword() == null) {
			user.setPassword(map.get(id).getPassword());
		}
		
		return super.update(id, user);
	}
	
}
