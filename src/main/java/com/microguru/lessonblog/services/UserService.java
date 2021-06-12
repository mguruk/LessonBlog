package com.microguru.lessonblog.services;

import java.util.Set;
import com.microguru.lessonblog.model.User;

/**
 * @author manish
 *
 */
public interface UserService {
	
	User findById(long id);
	
	User save(User user);
	
	Set<User> getAllUser();
}
