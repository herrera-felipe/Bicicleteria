package proyectoBicicleteria;

/**
 *
 * @author Felipe Herrera
 */
public class Bicicleta {
    
    private String nroSerie, modelo;
    private int anio;
    private float precio;

    public Bicicleta(String nroSerie, String modelo, int anio, float precio) {
        this.nroSerie = nroSerie;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    // Metodos
    public String getNroSerie() {
        return nroSerie;
    }
    
    // EJERCICIO 1: implementar metodos getPrecio y setPrecio
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
