package org.example.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String,String>> read() throws IOException {
        String file="C:\\Users\\freek\\IdeaProjects\\SDETB25JavaLiveClasses\\Files\\Employees.xlsx";
        FileInputStream fis=new FileInputStream(file);

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        List<Map<String,String>> excelData=new ArrayList<>();
        Row headerRow=sheet.getRow(0);
        for (int i = 1; i < 5; i++) {
            Row row=sheet.getRow(i);
            Map<String,String> rowMap=new LinkedHashMap<>();

            for (int j = 0; j < 4; j++) {
                String key=headerRow.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowMap.put(key,value);
            }

            excelData.add(rowMap);
        }


       return excelData;
    }
}
