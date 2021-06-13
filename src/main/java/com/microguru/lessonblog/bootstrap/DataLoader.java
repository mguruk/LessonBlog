package com.microguru.lessonblog.bootstrap;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.microguru.lessonblog.model.Post;
import com.microguru.lessonblog.services.PostService;
import com.microguru.lessonblog.services.map.PostServiceMap;




/**
 * @author manish
 *
 */
@Component
public class DataLoader implements CommandLineRunner{
	
	private final PostService  postService;

	
	public DataLoader(PostService postService) {
		super();
		this.postService = postService;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Post post1 = new Post();
		post1.setId(1L);
		post1.setTitle("My first blog");
		post1.setDescription("Description for the post ");
		post1.setBannerImage("/img/scre");
		post1.setBody("helloo");
		post1.setLastUpdated(LocalDateTime.now());
		post1.setPublishDate(LocalDateTime.now());
		post1.setViewCount(100);
		post1.setIsCommentEnable(0);
		post1.setIsEnable(0);
		
		postService.save(post1);
		System.out.println("Loaded Posts...");
		System.out.println(post1.getBody());
	}

}
