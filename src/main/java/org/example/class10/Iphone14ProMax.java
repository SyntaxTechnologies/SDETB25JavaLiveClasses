package org.example.class10;

public class Iphone14ProMax {

    String model;
    String make;
    void takePicture(){
        System.out.println("taking pic with 48 megapixel camera");
    }

    void takePicture(String picName){
        System.out.println("taking pic with 48 megapixel camera");
    }
    void makePhoneCall(){
        System.out.println("Making a phone call");
    }

    void playMusic(){
        System.out.println("Playing music");
    }

}

 class Iphone15ProMax extends Iphone14ProMax {


    void takePicture(int a){
        System.out.println("taking pic with brand new 48 megapixel camera");
    }


}