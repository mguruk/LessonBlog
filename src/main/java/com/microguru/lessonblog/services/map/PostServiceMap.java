package com.microguru.lessonblog.services.map;

import java.util.Set;

import com.microguru.lessonblog.model.Post;
import com.microguru.lessonblog.services.CrudService;

/**
 * @author manish
 *
 */
public class PostServiceMap extends AbstractMapService<Post, Long> implements CrudService<Post, Long> {

	@Override
	public  Set<Post> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Post findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Post save(Post object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteBy(id);
	}

	@Override
	public void delete(Post object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

}
