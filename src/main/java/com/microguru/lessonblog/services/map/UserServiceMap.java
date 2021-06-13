package com.microguru.lessonblog.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.microguru.lessonblog.model.User;
import com.microguru.lessonblog.services.CrudService;

/**
 * @author manish
 *
 */
@Service
public class UserServiceMap extends AbstractMapService<User, Long> implements CrudService<User, Long>{

	@Override
	public Set<User> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public User save( User object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteBy(id);
	}

	@Override
	public void delete(User object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

}
