public class TestSimpleRectangle {
    public static void main(String[] args) {

        System.out.println("Patient 0 :");
        SimpleRectangle rectangle_0; //Deklarer variablen rectangle_0
        rectangle_0 = new SimpleRectangle(1, 1); //Initialisere variablen med width og height
        rectangle_0.getArea(); //Henter metoden getArea, for at udregne og udskrive arealet
        rectangle_0.getPeri(); //Henter metoden getPeri, for at udregne og udskrive omkredsen

        System.out.println("No. 1 :");
        SimpleRectangle rectangle_1; //Deklarer variablen rectangle_1
        rectangle_1 = new SimpleRectangle(4, 40); //Initialisere variablen med width og height
        rectangle_1.getArea(); //Henter metoden getArea, for at udregne og udskrive arealet
        rectangle_1.getPeri(); //Henter metoden getPeri, for at udregne og udskrive omkredsen

        System.out.println("No. 2 :");
        SimpleRectangle rectangle_2; //Deklarer variablen rectangle_2
        rectangle_2 = new SimpleRectangle(3.5, 35.9); //Initialisere variablen med width og height
        rectangle_2.getArea(); //Henter metoden getArea, for at udregne og udskive arealet
        rectangle_2.getPeri(); //Henter metoden getPeri, for at udregne og udskrive omkredsen
    }
}

