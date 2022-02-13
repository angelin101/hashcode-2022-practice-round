package com.hashcode.practice.service;

import com.hashcode.practice.model.Pizza;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void write(Pizza pizza, String filename) {

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(pizza.toString());
        } catch (IOException e) {
            System.err.println("Failed while writing output: " + e);
        }
    }
}
