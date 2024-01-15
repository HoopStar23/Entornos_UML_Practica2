import java.util.ArrayList;

public class Area {

    private int id;
    private Punto p1;
    private Punto p2;
    private Punto p3;

    private Linea l1;
    private Linea l2;

    public Area (int id, Punto punto1, Punto punto2, Punto punto3){
        this.id = id;
        this.p1 = punto1;
        this.p2 = punto2;
        this.p3 = punto3;
    }

    public Area (Linea line1, Linea line2){
        this.l1 = line1;
        this.l2 = line2;
    }
}
