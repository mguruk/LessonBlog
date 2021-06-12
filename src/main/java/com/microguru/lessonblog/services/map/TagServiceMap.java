package com.microguru.lessonblog.services.map;

import java.util.Set;

import com.microguru.lessonblog.model.Tag;
import com.microguru.lessonblog.services.CrudService;

/**
 * @author manish
 *
 */
public class TagServiceMap extends AbstractMapService<Tag, Long> implements CrudService<Tag, Long>{

	@Override
	public Set<Tag> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Tag findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Tag save(Tag object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteBy(id);
	}

	@Override
	public void delete(Tag object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	

}
