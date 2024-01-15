public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto(1,3,5);
        Punto p2 = new Punto(1,6,7);
        Punto p3 = new Punto(1,1,4);


        Area area1 = new Area(1,p1,p2,p3);

        Linea linea1 = new Linea(2, p2,p3);
    }
}
