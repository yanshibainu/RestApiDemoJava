package tw.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.com.entities.User;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractController<User>{
	
}
