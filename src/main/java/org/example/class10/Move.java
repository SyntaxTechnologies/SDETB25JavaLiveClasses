package org.example.class10;

public interface Move {

    public void moveAble();

}
class Bike implements Move {
    public void moveAble() {
        System.out.println("Moving .....");
    }
}

class Camel implements Move{
    public void moveAble() {

    }
}

class  Tester{
    public static void main(String[] args) {
        Move m=new Bike();
        Move m2=new Camel();
    }
}