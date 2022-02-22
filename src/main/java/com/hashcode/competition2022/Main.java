package com.hashcode.competition2022;

import com.hashcode.competition2022.model.DomainModel;
import com.hashcode.competition2022.model.Result;
import com.hashcode.competition2022.service.Reader;
import com.hashcode.competition2022.service.Runner;
import com.hashcode.competition2022.service.Writer;
import org.apache.commons.io.FilenameUtils;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static final String OUTPUT_FILENAME_TEMPLATE = "output_%s.txt";

    public static void main(String[] args) {
        String mainPath = "src/main/resources/input/";
        List<String> paths = Arrays.asList(mainPath + "data_1.txt", "..............");

        paths.forEach(p -> {
            System.out.println("!!!!!!!!!!!!!File name : " + FilenameUtils.getName(p));
            // 1. read and parse input
            Reader reader = new Reader();
            List<DomainModel> models = reader.read(p);

            // 2. Process data and calculate result
            Runner runner = new Runner();
            Result result = runner.run(models);

            // 3. Write output data
            Writer writer = new Writer();
            writer.write(result, String.format(OUTPUT_FILENAME_TEMPLATE, FilenameUtils.getBaseName(p)));

        });
    }
}
