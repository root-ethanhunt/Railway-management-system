package svc.user.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import svc.user.entity.userEntity;
import svc.user.repository.userRepo;
import svc.user.service.userService;

@Service
public class userServiceImpl implements userService {

	@Autowired
	private userRepo userRepository;
	
	@Override
	public userEntity createUser(userEntity user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
