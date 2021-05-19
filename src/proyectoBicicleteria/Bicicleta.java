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

    
    public String getNroSerie() {
        return nroSerie;
    }
    
   
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
