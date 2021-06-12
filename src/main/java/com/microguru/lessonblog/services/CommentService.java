package com.microguru.lessonblog.services;

import java.util.Set;
import com.microguru.lessonblog.model.Comment;


/**
 * @author manish
 *
 */
public interface CommentService extends CrudService<Comment,Long>  {

	Set<Comment> getAllCommentByPost(long postId);
	
}
