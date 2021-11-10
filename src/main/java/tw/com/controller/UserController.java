package tw.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tw.com.entities.User;
import tw.com.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("/user/{userid}")
	public User getUserById(@PathVariable int userid) {
		return userService.getUserById(userid);
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@DeleteMapping("/user/{userid}")
	public List<User> deleteUser(@PathVariable int userid) {
		return userService.deleteUser(userid);
	}
	
	@PatchMapping("/user/{userid}")
	public List<User> updateUser(@RequestBody User user, @PathVariable int userid) {
		return userService.updateUser(user, userid);
	}
	
}
