package com.microguru.lessonblog.services;


import com.microguru.lessonblog.model.Post;

/**
 * @author manish
 *
 */
public interface PostService extends CrudService<Post, Long> {

	Post findByAuthor(long authorId);

}
