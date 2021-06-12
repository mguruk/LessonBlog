package com.microguru.lessonblog.model;

import java.time.LocalDateTime;

/**
 * @author manish
 *
 */
public class Comment {
	
	private String commentBody;
	private LocalDateTime commentTime;
	public String getCommentBody() {
		return commentBody;
	}
	public void setCommentBody(String commentBody) {
		this.commentBody = commentBody;
	}
	public LocalDateTime getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(LocalDateTime commentTime) {
		this.commentTime = commentTime;
	}
	

}
