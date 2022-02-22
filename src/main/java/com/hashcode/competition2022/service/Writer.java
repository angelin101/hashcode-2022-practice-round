package com.hashcode.competition2022.service;

import com.hashcode.competition2022.model.Result;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void write(Result result, String filename) {

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(result.toString());
        } catch (IOException e) {
            System.err.println("Failed while writing output: " + e);
        }
    }
}
