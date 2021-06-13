package com.microguru.lessonblog.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;
import com.microguru.lessonblog.model.Post;
import com.microguru.lessonblog.services.PostService;

/**
 * @author manish
 *
 */
@Service
public class PostServiceMap extends AbstractMapService<Post, Long> implements PostService {

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

	@Override
	public Post findByAuthor(long authorId) {
		// TODO Auto-generated method stub
		return null;
	}

}
