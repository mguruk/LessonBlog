package com.microguru.lessonblog.services;

import java.util.Set;
import com.microguru.lessonblog.model.Comment;


/**
 * @author manish
 *
 */
public interface CommentService {
	
	Comment save(Comment comment);
	Set<Comment> getAllCommentByPost(long id);
	
}
