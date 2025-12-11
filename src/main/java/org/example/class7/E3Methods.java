package org.example.class7;

public class E3Methods {
    public static void main(String[] args) {

        Math m = new Math();
        m.add(12, 13);

        m.multiply(10,10,10);
        m.getAvg(10,30);

        m.print(15,"Java");

        int[] numbers = {10, 20, 30, 40, 50};
        //m.printArray(numbers);

        int resul = m.addArray(numbers);

        if(resul>200){
            System.out.println("you will get a discount of 20%");
        }else {
            System.out.println("No discount");
        }
    }
}
