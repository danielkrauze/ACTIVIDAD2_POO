/*
Ejercicio resuelto Nº 15
Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
o menor peso.
 */
package Parte1;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class Cap4_Ejercicio15 {
       public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        double PESOA, PESOB, PESOC, PESOD;
        //Solicitamos al usuario que ingrese los datos del empleado:
        PESOA = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el peso de la esfera A: "));
        PESOB = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el peso de la esfera B: "));
        PESOC = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el peso de la esfera C: "));
        PESOD = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el peso de la esfera D: "));
        //A continuación procesamos los datos:
        if ((PESOA == PESOB) && (PESOB == PESOC)){
            JOptionPane.showMessageDialog(null, "La esfera D es la diferente.");
        }
        else if ((PESOA == PESOB) && (PESOB == PESOD)){
            JOptionPane.showMessageDialog(null, "La esfera C es la diferente.");
        }
        else if ((PESOA == PESOC) && (PESOC == PESOD)){
            JOptionPane.showMessageDialog(null, "La esfera B es la diferente.");
        }
        else if ((PESOB == PESOC) && (PESOC == PESOD)){
            JOptionPane.showMessageDialog(null, "La esfera A es la diferente.");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR: Ingresó al menos dos datos diferentes o todos iguales.");
        }
   }
}
