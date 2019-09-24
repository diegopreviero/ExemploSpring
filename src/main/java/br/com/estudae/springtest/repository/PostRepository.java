package br.com.estudae.springtest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import br.com.estudae.springtest.model.Post;

@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
public interface PostRepository extends CrudRepository<Post, Long>{
	Post findOneByTitle(String title);
	List<Post> findByBodyContaining(String keyword);

}
