package org.example.class13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E1Exception {
    public static void main(String[] args) {


        try {
           FileInputStream fis = new FileInputStream("C:\\Users\\freek\\IdeaProjects\\SDETB25JavaLiveClasses\\Files\\Config.properties");
            int[] a = new int[-5];
            String b="ss";
            b.charAt(15);
        } catch (FileNotFoundException f) {
            System.out.println("Hey either the path is incorrect or somebody deleted the file");
        } catch (NegativeArraySizeException sdfsdf) {
            System.out.println("Negative size arrays are not possible in java");
        }catch (Exception alex){
            System.out.println("Something went wrong please contact support");
        }

    }
}
