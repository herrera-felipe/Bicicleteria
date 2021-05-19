
package proyectoBicicleteria;

/**
 *
 * @author Felipe Herrera
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Bicicleteria nuevaBicicleteria = new Bicicleteria();
        
        Bicicleta bicicleta_1 = new Bicicleta("1234", "Mountain Bike", 2020, 0);
        bicicleta_1.setPrecio(9999.99f);
        
        Bicicleta bicicleta_2 = new Bicicleta("8520", "Scott", 2019, 20500);
        
        nuevaBicicleteria.addBicicleta(bicicleta_1);
        nuevaBicicleteria.addBicicleta(bicicleta_2);
        
        System.out.println(nuevaBicicleteria.buscarBicicleta("8520"));
              
        nuevaBicicleteria.venderBicicleta(bicicleta_1);
    }
}
