package com.hashcode.practice.service;

import com.hashcode.practice.model.Client;
import com.hashcode.practice.model.Pizza;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {

    public Pizza run(List<Client> clients) {
        Pizza result = new Pizza(getPizzaIngredients1(clients));

        // verification step might be skipped
        checkResult(clients, result);
        return result;
    }


    private void checkResult(List<Client> clients, Pizza pizza) {
        int maxSatisfiedNumber = clients.size();
        int actualSatisfiedNumber = 0;

        for (Client client : clients) {
            if (pizza.getIngredients().containsAll(client.getLikes())
                    && !CollectionUtils.containsAny(pizza.getIngredients(), client.getDislikes())) {
                actualSatisfiedNumber++;
            }
        }

        System.out.println("AMOUNT OF CLIENTS: " + maxSatisfiedNumber);
        System.out.println("AMOUNT OF SATISFIED CLIENTS: " + actualSatisfiedNumber);
        System.out.println("OUTPUT: " + pizza);
    }

    // 1 exclude disliked from likes (if liked MORE than disliked)
    private List<String> getPizzaIngredients1(List<Client> clients) {
        Set<String> likes = new HashSet<>();
        Set<String> dislikes = new HashSet<>();

        for (Client client : clients) {
            likes.addAll(client.getLikes());
            dislikes.addAll(client.getDislikes());
        }
        likes.removeAll(dislikes);

        return new ArrayList<>(likes);
    }

    // 2 ... (if liked LESS than disliked)
    private List<String> getPizzaIngredients2(List<Client> clients) {

        return null;
    }
}
