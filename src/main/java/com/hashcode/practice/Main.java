package com.hashcode.practice;

import com.hashcode.practice.service.Reader;
import com.hashcode.practice.service.Runner;
import com.hashcode.practice.service.Writer;

public class Main {
    public static void main(String[] args) {
        // 1. read and parse input
        Reader reader = new Reader();
        reader.read();

        // 2. Process data and calculate result
        Runner runner = new Runner();
        runner.run();

        // 3. Write output data
        Writer writer = new Writer();
        writer.write();
    }
}
