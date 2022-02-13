package com.hashcode.practice;

import com.hashcode.practice.model.Client;
import com.hashcode.practice.model.Pizza;
import com.hashcode.practice.service.Reader;
import com.hashcode.practice.service.Runner;
import com.hashcode.practice.service.Writer;
import org.apache.commons.io.FilenameUtils;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static final String OUTPUT_FILENAME_TEMPLATE = "output_%s.txt";

    public static void main(String[] args) {
        String mainPath = "src/main/resources/inputData/";
        List<String> paths = Arrays.asList(mainPath + "a_.txt", mainPath + "c_.txt",
                mainPath + "d_.txt", mainPath + "e_.txt");

        paths.forEach(p -> {
            System.out.println("!!!!!!!!!!!!!File name : " + FilenameUtils.getName(p));
            // 1. read and parse input
            Reader reader = new Reader();
            List<Client> clients = reader.read(p);

            // 2. Process data and calculate result
            Runner runner = new Runner();
            Pizza pizza = runner.run(clients);

            // 3. Write output data
            Writer writer = new Writer();
            writer.write(pizza, String.format(OUTPUT_FILENAME_TEMPLATE, FilenameUtils.getBaseName(p)));

        });
    }
}
