package br.com.estudae.springtest.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudae.springtest.model.Post;
import br.com.estudae.springtest.repository.PostRepository;

@RestController
public class PostRestController {

	private final PostRepository postRepository;
	
	@Autowired
	public PostRestController (PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	@RequestMapping(value="/post/findByTitle")
	public Post findOneByTitle(@RequestParam("title") String title) {
		return postRepository.findOneByTitle(title);
	}
	
	@RequestMapping("/post/search")
	public List<Post> findByBodyContaining(@RequestParam("keyword") String keyword){
		return postRepository.findByBodyContaining(keyword);
	}
	
	@RequestMapping("/post/count")
	public long count() {
		return postRepository.count();
	}
}
