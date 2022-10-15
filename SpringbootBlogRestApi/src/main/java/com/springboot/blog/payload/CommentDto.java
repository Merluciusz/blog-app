package com.springboot.blog.payload;

import com.springboot.blog.entity.Post;
import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {
    private long id;
    @NotEmpty(message = "name should not be null or empty")
    private String name;
    @NotEmpty(message = "must be a well-formed email address")
    @Email
    private String email;
    @NotEmpty
    @Size(min = 10, message = "comment body should be minimum 10 characters")
    private String body;


}
