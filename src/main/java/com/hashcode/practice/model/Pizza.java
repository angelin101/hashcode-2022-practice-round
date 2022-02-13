package com.hashcode.practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {

    public List<String> ingredients;

    @Override
    public String toString() {
        // example: 4 cheese mushrooms tomatoes peppers
        return String.format("%s %s", ingredients.size(), String.join(" ", getIngredients()));
    }
}
