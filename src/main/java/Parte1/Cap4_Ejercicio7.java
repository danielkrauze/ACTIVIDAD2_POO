/*
7. Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
si A es mayor, menor o igual a B.
 */
package Parte1;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class Cap4_Ejercicio7 {
    public static void main(String[] args){
        //A continuación definimos las variables:
        float A, B;
        //A continuación solicitamos al usuario que ingrese el valor de dos números A y B, respectivamente:
        JOptionPane.showMessageDialog(null, "Por favor ingrese dos números:");
        A = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número a: "));
        B = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número b: "));
        //Operamos con los valores A y B ingresados por los usuarios
        if(A > B){
                JOptionPane.showMessageDialog(null, "A es mayor que B.");
            }
        else{
            if(A == B){
                 JOptionPane.showMessageDialog(null, "A es igual a B.");
            }
            else{
                JOptionPane.showMessageDialog(null, "A es menor que B.");
            }
        }
    }
}
