package com.codeprince.minifacebookclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String postMessage;
    @CreationTimestamp
    private Timestamp timeOfPost;
//    private int userId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
