package com.hashcode.practice.model;

import lombok.Data;

import java.util.List;

@Data
public class Client {
    List<String> likes;
    List<String> dislikes;

}
