package com.microguru.lessonblog.services;

import java.util.Set;
import com.microguru.lessonblog.model.Post;

/**
 * @author manish
 *
 */
public interface PostService {

	Post findByAuthor(long authorId);
	
	Post findById(long id);
	
	Post save(Post post);
	
	Set<Post> getAllPost();
}
