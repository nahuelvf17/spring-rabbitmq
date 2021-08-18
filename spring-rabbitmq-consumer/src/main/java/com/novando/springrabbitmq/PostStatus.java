package com.novando.springrabbitmq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostStatus {
    private PostDto post;
    private String status;//progress,completed
    private String message;
}
