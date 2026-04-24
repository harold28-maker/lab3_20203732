
import java.util.ArrayList;


public class Club {

    private String nombre;
    private String cant_miembros;
    private Presidente presidente;
    private String tipo;
    private ArrayList<Evento> listaEventos;


    //getter and setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCant_miembros() {
        return cant_miembros;
    }

    public void setCant_miembros(String cant_miembros) {
        this.cant_miembros = cant_miembros;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }
    public void imprimir(){
        System.out.println("este es el nombre del club: "+ nombre);
        System.out.println("tipo de club: "+ tipo);
        System.out.println("el presidente del club es: "+ presidente.getNombre());
        System.out.println("el codigo del presidente: "+ presidente.getCodigo());

    }
}
