import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class E22ProductosTxt{
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new FileReader("productos.txt"))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if(datos.length == 2){
                    String nombre = datos[0];
                    double precio = Double.parseDouble(datos[1]);
                    System.out.println("NOMBRE DEL PRODUCTO: " + nombre + " -->-->-->-->  PRECIO: " + precio + "€");
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }
    }
}