package com.microguru.lessonblog.model;


import java.time.LocalDateTime;

/**
 * @author manish
 *
 */
public class Post {

	private String title;
	private String description;
	private String bannerImage;
	private String body;
	private LocalDateTime publishDate;
	private LocalDateTime lastUpdated;
	private int isEnable;
	private int isCommentEnable;
	private long viewCount;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBannerImage() {
		return bannerImage;
	}
	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public LocalDateTime getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDateTime publishDate) {
		this.publishDate = publishDate;
	}
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public int getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}
	public int getIsCommentEnable() {
		return isCommentEnable;
	}
	public void setIsCommentEnable(int isCommentEnable) {
		this.isCommentEnable = isCommentEnable;
	}
	public long getViewCount() {
		return viewCount;
	}
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}
	
	
}
