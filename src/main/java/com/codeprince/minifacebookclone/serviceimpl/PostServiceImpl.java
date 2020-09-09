package com.codeprince.minifacebookclone.serviceimpl;

import com.codeprince.minifacebookclone.model.Post;
import com.codeprince.minifacebookclone.repository.PostRepository;
import com.codeprince.minifacebookclone.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public void savePost(Post post) {
        this.postRepository.save(post);
    }
}
