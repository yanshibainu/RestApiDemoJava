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
		if(iRepository.findById(id).isPresent()) {
			User oringinalUser = iRepository.findById(id).get();
			if(entity.getId() != oringinalUser.getId()) {
				entity.setId(id);
			}
			if(entity.getName() == null) {
				entity.setName(oringinalUser.getName());
			}
			if(entity.getEmail() == null) {
				entity.setPassword(oringinalUser.getEmail());
			}
			if(entity.getPassword() == null) {
				entity.setPassword(oringinalUser.getPassword());
			}
			return super.update(id, entity);
		}else {
			return null;
		}
	}
	
	
	
}
