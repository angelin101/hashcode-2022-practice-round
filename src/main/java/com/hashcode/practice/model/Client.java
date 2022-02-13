package com.hashcode.practice.model;

import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class Client {
    List<String> likes = Collections.emptyList();
    List<String> dislikes = Collections.emptyList();

    @Override
    public String toString() {
        return String.format("likes: %s %s; dislikes: %s %s", likes.size(), String.join(" ", getLikes()), dislikes.size(), String.join(" ", getDislikes()));
    }
}
