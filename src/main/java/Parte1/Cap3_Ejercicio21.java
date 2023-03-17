/*
21. Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo.
*/
package Parte1;
import javax.swing.JOptionPane;
/**
 * @author daniel_krauze
 */
public class Cap3_Ejercicio21 {
    public static void main(String[] args) {
            // Definimos las variables de acuerdo con los requerimientos del problema
        double ladoA, ladoB, ladoC, perimetro, semiperimetro, area;
        //Solicitamos al usuario que ingrese el lado del triángulo equilátero:
        ladoA = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor del primer lado de un triángulo: "));
        ladoB = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor del primer lado de un triángulo: "));
        ladoC = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor del primer lado de un triángulo: "));
        //A continuación se hace el procesamiento de los datos ingresados por el usuario:
        perimetro = ladoA+ladoB+ladoC;
        semiperimetro = perimetro*0.5;
        area = Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC));
        //Ahora mostramos la salida de datos solicitada por el enunciado del problema:
        JOptionPane.showMessageDialog(null, "El perímetro del triángulo equilátero es "+perimetro+" unidades lineales.\nSu semiperimetro es "+semiperimetro+" unidades linéales.\nSu área es "+area+" unidades de área.");
    }
}
