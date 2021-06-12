package com.microguru.lessonblog.model;

import java.time.LocalDateTime;

/**
 * @author manish
 *
 */
public class Tag extends BaseEntity{
	
	private String tagName;
	private LocalDateTime tagCreationTime;
	
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public LocalDateTime getTagCreationTime() {
		return tagCreationTime;
	}
	public void setTagCreationTime(LocalDateTime tagCreationTime) {
		this.tagCreationTime = tagCreationTime;
	}
}
