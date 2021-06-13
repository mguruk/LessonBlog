package com.microguru.lessonblog.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.microguru.lessonblog.model.Category;
import com.microguru.lessonblog.services.CrudService;

/**
 * @author manish
 *
 */
@Service
public class CategoryServiceMap extends AbstractMapService<Category, Long> implements CrudService<Category, Long> {

	@Override
	public Set<Category> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Category findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Category save(Category object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(),object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteBy(id);
	}

	@Override
	public void delete(Category object) {
		// TODO Auto-generated method stub
		super.delete(object);
	} 
	
	
}
