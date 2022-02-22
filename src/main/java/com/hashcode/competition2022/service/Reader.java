package com.hashcode.competition2022.service;

import com.hashcode.competition2022.model.DomainModel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {

    public List<DomainModel> read(String path) {
        List<DomainModel> models = new ArrayList<>();

        // Reads data from file;
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            List<String> lines = stream.collect(Collectors.toList());
            // Algorithm to map data to model
            models = readAlgorithm(lines);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return models;
    }

     List<DomainModel> readAlgorithm(List<String> lines){
        List<DomainModel> domainModels = new ArrayList<>();
        //todo REAL algorithm
//        for (int i = 1; i < lines.size() - 1; i += 2) {
//            clients.add(mapClientFields(parseLine(lines.get(i)), parseLine(lines.get(i + 1))));
//        }
        return domainModels;
    }

//    Client mapClientFields(List<String> likes, List<String> dislikes) {
//        Client client = new Client();
//        client.setLikes(likes);
//        client.setDislikes(dislikes);
//        return client;
//    }
//
//    List<String> parseLine(String ingrediens) {
//        Optional<String> optStr = Optional.ofNullable(ingrediens);
//        return optStr.map(s -> Arrays.stream(s.split(" ")).skip(1).collect(Collectors.toList())).orElse(Collections.emptyList());
//    }


}
