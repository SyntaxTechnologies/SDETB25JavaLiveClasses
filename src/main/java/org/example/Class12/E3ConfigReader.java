package org.example.Class12;

import org.example.utils.ConfigReader;

import java.io.IOException;

public class E3ConfigReader {
    public static void main(String[] args) throws IOException {

      String value=  ConfigReader.read("password");
        System.out.println(value);

    }
}
