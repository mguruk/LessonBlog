package com.microguru.lessonblog.services;

import java.util.Set;
import com.microguru.lessonblog.model.Category;


/**
 * @author manish
 *
 */
public interface CategoryService {
	
	Category save(Category category);
	Set<Category> getAllCategory();

}
