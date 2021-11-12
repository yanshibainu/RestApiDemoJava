package tw.com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tw.com.entities.User;
import tw.com.service.IService;

@RestController
public class UserController {
	@Autowired
	private IService<User> iService;
	
	@GetMapping("/user")
	public Map<Integer, User> getAllUser(){
		return iService.getAll();
	}
	
	@GetMapping("/user/{userid}")
	public User getUserById(@PathVariable int userid) {
		return iService.getById(userid);
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return iService.add(user);
	}
	
	@DeleteMapping("/user/{userid}")
	public void deleteUser(@PathVariable int userid) {
		iService.delete(userid);
	}
	
	@PatchMapping("/user/{userid}")
	public User updateUser(@RequestBody User user, @PathVariable int userid) {
		return iService.update(user, userid);
	}
	
}
