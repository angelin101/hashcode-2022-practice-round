package com.hashcode.practice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void testToString() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("cheese");
        ingredients.add("mushrooms");
        ingredients.add("tomatoes");
        ingredients.add("peppers");
        Pizza pizza = new Pizza();
        pizza.setIngredients(ingredients);

        String expected = "4 cheese mushrooms tomatoes peppers";
        Assertions.assertEquals(expected, pizza.toString());
    }
}
