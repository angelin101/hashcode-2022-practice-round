package com.hashcode.practice.model;

import lombok.Data;

import java.util.List;

@Data
public class Pizza {

    public List<String> ingredients;

    @Override
    public String toString() {
        // example: 4 cheese mushrooms tomatoes peppers
        return String.format("%s %s", ingredients.size(), String.join(" ", getIngredients()));
    }
}
