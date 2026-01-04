package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
  public static String read(String key) throws IOException {

      // location of file
      String filePath="C:\\Users\\freek\\IdeaProjects\\SDETB25JavaLiveClasses\\Files\\Config.properties";
      // class that will bring the content of the file into java program
      FileInputStream fis=new FileInputStream(filePath);
      // a special class that knows how
      Properties properties=new Properties();
      // loads the data from fileinputstream
      properties.load(fis);
      return properties.getProperty(key);



  }
}
