package org.example.Class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigFiles {
    public static void main(String[] args)  {

        // location of file
        String filePath="C:\\Users\\freek\\IdeaProjects\\SDETB25JavaLiveClasses\\Files\\Config.properties";
        // class that will bring the content of the file into java program
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // a special class that knows how

            // loads the data from fileinputstream
            properties.load(fis);
        }catch (Exception e){
            System.out.println("Something bad has happened");
        }
      //  System.out.println(properties.getProperty("browser"));
      //  System.out.println(properties.getProperty("userName"));
       // System.out.println(properties.getProperty("password"));
        properties.entrySet().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));


    }
}
