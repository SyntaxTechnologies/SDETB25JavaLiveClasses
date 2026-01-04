package org.example.Class12;

import org.example.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        List<Map<String, String>> data = ExcelReader.read();

        Map<String, String> rowMap = data.get(2);
        System.out.println(rowMap.get("Last Name"));
    }
}
