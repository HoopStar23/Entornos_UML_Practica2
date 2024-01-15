import java.util.ArrayList;

public class Linea {

    private int id;
    private Punto p1;
    private Punto p2;

    public Linea(int id, Punto punto1, Punto punto2){
        this.id = id;
        this.p1 = punto1;
        this.p2 = punto2;
    }

    public Linea(ArrayList<Punto> listaPuntos){
        this.p1 = listaPuntos.get(0);
        this.p2 = listaPuntos.get(1);
    }
}
