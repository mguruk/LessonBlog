package com.microguru.lessonblog.model;


/**
 * @author manish
 *
 */
public class Category extends BaseEntity{
	
	private String categoryName;
	private int isEnable;
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}
	
	
}
