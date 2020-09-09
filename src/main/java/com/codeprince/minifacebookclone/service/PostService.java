package com.codeprince.minifacebookclone.service;

import com.codeprince.minifacebookclone.model.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts();
    void savePost(Post post);
}
