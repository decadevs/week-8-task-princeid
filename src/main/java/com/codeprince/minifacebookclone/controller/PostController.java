package com.codeprince.minifacebookclone.controller;

import com.codeprince.minifacebookclone.model.Post;
import com.codeprince.minifacebookclone.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    // Display list of posts
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listPosts", postService.getAllPosts());
        return "index";
    }

    // Save a post
//    @PostMapping("/savePost")
    @RequestMapping(value = "/savePost", method = RequestMethod.POST)
    public String savePost(@ModelAttribute Post post, BindingResult errors, Model model) {
//        post = new Post();
//        model.addAttribute("post", post);

        // Save post to database
        postService.savePost(post);
        return "index";
    }
}
