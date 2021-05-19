package bicicleteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Herrera
 */
public class Bicicleteria {
    
    private List<Bicicleta> bicicletas;
    private float ganancias;
    private Integer cantidadVentas;
    
    
    public Bicicleteria() {
        this.bicicletas = new ArrayList<Bicicleta>();
        this.cantidadVentas = 0;
        this.ganancias = 0;
    }
   
    public void venderBicicleta (Bicicleta bicicleta) {
        this.bicicletas.remove(bicicleta); // Elimina bicicleta de la Lista.
        this.cantidadVentas++; // Incrementa la Cantidad de Ventas.
        this.ganancias += bicicleta.getPrecio(); // Suma las ganancias actuales con el precio, y asigna el nuevo valor.
    }
    
    
    public void addBicicleta (Bicicleta nuevaBici) {
        this.bicicletas.add(nuevaBici); // Agrega la nuevaBici a la Lista.
    } 
    
    
    public Integer buscarBicicleta(String nroDeSerie) {
        Integer bicicletaEncontrada = null;// En caso de no encontrar una bici, retorna null.
        
        // Ciclo for para recorrer la lista.
        for (int i = 0; i < this.bicicletas.size(); i++) {
            // Busca el nroDeSerie que coincida.
            if (this.bicicletas.get(i).getNroSerie().equals(nroDeSerie)) {
                bicicletaEncontrada = i; // Asigna la pos del obj. encontrado
                i = this.bicicletas.size(); // Interrumpe el ciclo for. asignandole a i el valor del tamaño de la lista u arreglo.
            }
            
        }
        return bicicletaEncontrada;
    }
    
    
    public float precioTotalBicicletas() {
        float precioTotal = 0;
        
        for (int i = 0; i < bicicletas.size(); i++) {
            precioTotal += bicicletas.get(i).getPrecio();
        }
        return precioTotal;
    }
}
