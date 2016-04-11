package cardviewandrecyclerview.cruzrovira.blackice;

/**
 * Created by cruzr on 6/4/2016.
 */
public class Titular {
    private  int imagen;
    private  String titulo;
    private  String contenido;
    // Generations contructor
    public Titular(){

    }
    public Titular(int imagen, String titulo, String contenido) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // generate properties
    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
