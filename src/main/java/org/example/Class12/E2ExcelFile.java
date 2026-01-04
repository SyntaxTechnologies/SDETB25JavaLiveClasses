package org.example.Class12;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E2ExcelFile {
    public static void main(String[] args) throws IOException {

        String file="C:\\Users\\freek\\IdeaProjects\\SDETB25JavaLiveClasses\\Files\\Employees.xlsx";
        FileInputStream fis=new FileInputStream(file);

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        for (int i = 0; i < 5; i++) {
            Row row=sheet.getRow(i);
            for (int j = 0; j < 4; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }



    }
}
