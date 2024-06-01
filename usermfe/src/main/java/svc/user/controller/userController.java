package svc.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import svc.user.constants.userConstant;
import svc.user.entity.userEntity;
import svc.user.service.userService;

@RequestMapping(value=userConstant.USER_API,produces=MediaType.APPLICATION_JSON_VALUE)
@RestController
public class userController {
	@Autowired
	private userService userServices;

//	@Autowired
	public userController(userService userServices) {
		super();
		this.userServices=userServices;
	}
	
	@PostMapping(value="/createuser",produces=MediaType.APPLICATION_JSON_VALUE)
	public userEntity createUser(@RequestBody userEntity user){
		return userServices.createUser(user);

	}

	

}
