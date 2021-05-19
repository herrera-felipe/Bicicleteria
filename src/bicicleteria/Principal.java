
package bicicleteria;

/**
 *
 * @author Felipe Herrera
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Bicicleteria sedeMendoza = new Bicicleteria();
        
        Bicicleta bicicleta_1 = new Bicicleta("1234", "Mountain Bike", 2020, 0);
        bicicleta_1.setPrecio(9999.99f);
        
        Bicicleta bicicleta_2 = new Bicicleta("8520", "Scott", 2019, 20500);
        
        sedeMendoza.addBicicleta(bicicleta_1);
        sedeMendoza.addBicicleta(bicicleta_2);
        
        System.out.println("Precio total de las bicicletas: $" + sedeMendoza.precioTotalBicicletas());
        
        // Llamada al metodo buscar bicicleta por # serie
        System.out.println(sedeMendoza.buscarBicicleta("8520"));
              
        sedeMendoza.venderBicicleta(bicicleta_1);
        
        
    }
}
