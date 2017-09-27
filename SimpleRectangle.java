public class SimpleRectangle {
    //Deklarer variabler
    double widthRec; //Bredden på rektanglet
    double heightRec; //Højden på rektanglet
    double areaRec; //Arealet af rektanglet
    double periRec; //Omkredsen af rektanglet

    //Constructor til hver gang et nyt rektangel bliver lavet
    //Der er stillet krav til at både bredde og højde skal være anvist, før der bliver lavet et nyt rektangel
    SimpleRectangle(double widthRec, double heightRec){
        areaRec = (heightRec * widthRec);
        periRec = ((widthRec * 2) + (heightRec * 2));
        System.out.println("Simple Rectangle with a width of " + widthRec + " and a height of " + heightRec);
    }
    //Metoden getArea, der finder arealet af rektanglet
    public void getArea(){
        System.out.println("Area of Simple Rectangle is " + areaRec);
    }
    //Metoden getPeri, der finder omkredsen af rektanglet
    public void getPeri(){
        System.out.println("Perimeter of Simple Rectangle is " + periRec);
    }
}
