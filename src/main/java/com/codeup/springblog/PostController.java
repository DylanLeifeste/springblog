package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {


    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String viewPosts(){
        return "Viewing all posts: ";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getPostId(@PathVariable Long id){
        return "Viewing Post ID " + id;
    }


    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String createPost(){
        return "Create Post Page";
    }

    @PostMapping(path = "/posts/create")
    @ResponseBody
    public String createdPost(){
        return "Created post shows up";
    }


}
