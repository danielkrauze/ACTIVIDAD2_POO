/*
19. Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo.
*/
package Parte1;
import javax.swing.JOptionPane;
/**
 * @author daniel_krauze
 */
public class Cap3_Ejercicio19 {
    public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema
        double lado, perimetro, altura, area;
        //Solicitamos al usuario que ingrese el lado del triángulo equilátero:
        lado = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor del lado de un triángulo equilátero: "));
        //A continuación se hace el procesamiento de los datos ingresados por el usuario:
        perimetro = 3*lado;
        altura = Math.sqrt(3)*0.5*lado;
        area = Math.sqrt(3)*0.25*Math.pow(lado, 2);
        //Ahora mostramos la salida de datos solicitada por el enunciado del problema:
        JOptionPane.showMessageDialog(null, "El perímetro del triángulo equilátero es "+perimetro+" unidades lineales.\nSu altura es "+altura+" unidades linéales.\nSu área es "+area+" unidades de área.");
    }
}
