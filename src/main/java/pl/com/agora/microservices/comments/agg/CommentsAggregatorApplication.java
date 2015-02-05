package pl.com.agora.microservices.comments.agg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import pl.com.agora.springboot.comments.Comment;

@SpringBootApplication
public class CommentsAggregatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommentsAggregatorApplication.class, args);
    }
    
    @Bean(name="comments")
    public List<Comment> comments() {
        return new ArrayList<Comment>();
    }
}
