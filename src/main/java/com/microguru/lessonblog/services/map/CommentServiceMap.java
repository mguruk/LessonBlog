package com.microguru.lessonblog.services.map;

import java.util.Set;

import com.microguru.lessonblog.model.Comment;
import com.microguru.lessonblog.services.CrudService;

/**
 * @author manish
 *
 */
public class CommentServiceMap extends AbstractMapService<Comment, Long>  implements CrudService<Comment, Long>{

	@Override
	public Set<Comment> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Comment findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Comment save( Comment object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteBy(id);
	}

	@Override
	public void delete(Comment object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	
}
