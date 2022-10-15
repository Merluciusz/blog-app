package com.springboot.blog;

import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringbootBlogRestApiApplicationTests {

    @Autowired
    private PostService postService;

    @Autowired
    private PostRepository postRepository;


    @Test
    void contextLoads() {
    }

    @Test
    public void testCountPosts(){
        long count = postRepository.count();
        assertThat (count).isGreaterThan(0);
    }

    @Test
    public void testService(){

    }

}
