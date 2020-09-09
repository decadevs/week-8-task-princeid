package com.codeprince.minifacebookclone;

import com.codeprince.minifacebookclone.model.Post;
import com.codeprince.minifacebookclone.model.User;
import com.codeprince.minifacebookclone.repository.PostRepository;
import com.codeprince.minifacebookclone.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.Calendar;

@SpringBootTest
class MiniFacebookCloneApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testCreate() throws ParseException {
        User user = new User();

        Calendar cal = Calendar.getInstance();
        cal.set(1996, Calendar.SEPTEMBER, 12);

        user.setFirstName("Ebi");
        user.setLastName("Snow");
        user.setEmail("test10@test.com");
        user.setPassword("56789");
        user.setDob(cal.getTime());
        user.setGender("Male");

        userRepository.save(user);
    }

    @Test
    void testCreatePost() {

        User user = new User();

        Calendar cal = Calendar.getInstance();
        cal.set(1996, Calendar.SEPTEMBER, 12);

        user.setFirstName("Jude");
        user.setLastName("Snow");
        user.setEmail("test70@test.com");
        user.setPassword("56789");
        user.setDob(cal.getTime());
        user.setGender("Male");

        userRepository.save(user);

        Post post1 = new Post();
        post1.setPostMessage("I don't have anything on my mind");
        post1.setUser(user);

        Post post2 = new Post();
        post2.setPostMessage("Hello World");
        post2.setUser(user);

        postRepository.save(post1);
        postRepository.save(post2);
    }

}
