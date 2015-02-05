package pl.com.agora.microservices.comments.agg.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import pl.com.agora.springboot.comments.Comment;

@Controller
@RequestMapping("/comment")
public class CommentsController {
    
    @Resource(name="comments")
    private List<Comment> comments;
    
    @RequestMapping(value="/list", method= {RequestMethod.GET})
    public String list(Map<String, Object> model) {
        model.put("comments", comments);
        return "comments";
    }
    
    @RequestMapping(value="/", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
    @ResponseStatus(HttpStatus.OK)
    public void add(@RequestBody Comment comment) {
        comments.add(comment);
    }

}
