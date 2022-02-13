package com.hashcode.practice.service;

import com.hashcode.practice.model.Pizza;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static final String OUTPUT_FILENAME = "output.txt";

    public void write(Pizza pizza) {

        try (FileWriter writer = new FileWriter(OUTPUT_FILENAME)) {
            writer.write(pizza.toString());
        } catch (IOException e) {
            System.err.println("Failed while writing output: " + e);
        }
    }
}
