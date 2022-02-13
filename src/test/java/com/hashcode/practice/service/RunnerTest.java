package com.hashcode.practice.service;

import com.hashcode.practice.model.Client;
import com.hashcode.practice.model.Pizza;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class RunnerTest {

    private Pizza pizza = new Pizza();

    @BeforeEach
    void setUp() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("cheese");
        ingredients.add("mushrooms");
        ingredients.add("tomatoes");
        ingredients.add("peppers");
        pizza.setIngredients(ingredients);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testRun() {
        List<Client> clients = new ArrayList<>();

//        3
//        2 cheese peppers
//        0
//        1 basil
//        1 pineapple
//        2 mushrooms tomatoes
//        1 basil

        List<String> likedIngredients1 = Arrays.asList("cheese", "peppers");
        List<String> dislikedIngredients1 = Arrays.asList();

        List<String> likedIngredients2 = Arrays.asList("basil");
        List<String> dislikedIngredients2 = Arrays.asList("pineapple");

        List<String> likedIngredients3 = Arrays.asList("mushrooms", "tomatoes");
        List<String> dislikedIngredients3 = Arrays.asList("basil");

        Client client1 = new Client();
        client1.setLikes(likedIngredients1);
        client1.setDislikes(dislikedIngredients1);

        Client client2 = new Client();
        client2.setLikes(likedIngredients2);
        client2.setDislikes(dislikedIngredients2);

        Client client3 = new Client();
        client3.setLikes(likedIngredients3);
        client3.setDislikes(dislikedIngredients3);

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        Pizza actualPizza = new Runner().run(clients);

        Assertions.assertTrue(pizza.getIngredients().containsAll(actualPizza.getIngredients()));
    }
}
