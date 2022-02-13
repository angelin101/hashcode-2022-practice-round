package com.hashcode.practice.service;

import com.hashcode.practice.model.Client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {

    public List<Client> read(String path) {
        List<Client> clients = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            List<String> lines = stream.collect(Collectors.toList());

            for (int i = 1; i < lines.size() - 1; i += 2) {
                clients.add(mapClientFields(parseLine(lines.get(i)), parseLine(lines.get(i + 1))));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clients;
    }

    Client mapClientFields(List<String> likes, List<String> dislikes) {
        Client client = new Client();
        client.setLikes(likes);
        client.setDislikes(dislikes);
        return client;
    }

    List<String> parseLine(String ingrediens) {
        Optional<String> optStr = Optional.ofNullable(ingrediens);
        return optStr.map(s -> Arrays.stream(s.split(" ")).skip(1).collect(Collectors.toList())).orElse(Collections.emptyList());
    }


}
