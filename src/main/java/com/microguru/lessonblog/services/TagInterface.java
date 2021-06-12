package com.microguru.lessonblog.services;

import java.util.Set;
import com.microguru.lessonblog.model.Tag;

public interface TagInterface {
	
	Tag save(Tag tag);
	Set<Tag> getAllTag();
}
