/*
Ejercicio resuelto Nº 14
Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
vendedores. Al final del período, a cada departamento se le pide el importe global de las
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
• Ventas del departamento 1
• Ventas del departamento 2
• Ventas del departamento 3
• Salario de los vendedores de cada departamento
Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
al finalizar el período.
 */
package Parte1;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class Cap4_Ejercicio14 {
       public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        double VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1 = 0, SALAR2 = 0, SALAR3 = 0;
        //Solicitamos al usuario que ingrese los datos del empleado:
        VD1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese las ventas del departamento 1: "));
        VD2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese las ventas del departamento 2: "));
        VD3 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese las ventas del departamento 3: "));
        SALAR = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el salario base de los trabajadores: "));
        //A continuación procesamos los datos:
        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33*TOTVEN;
        if ((VD1 > PORVEN) && (VD2 < PORVEN) && (VD3 < PORVEN)){
            SALAR1 = SALAR*(1+0.2);
            SALAR2 = SALAR;
            SALAR3 = SALAR;
            JOptionPane.showMessageDialog(null, "El salario de los vendedores del departamento 1 es $"+SALAR1+".\nEl salario de los vendedores del departamento 2 es $"+SALAR2+".\nEl salario de los vendedores del departamento 3 es $"+SALAR3+".");
        }
        else if ((VD1 > PORVEN) && (VD2 > PORVEN) && (VD3 < PORVEN)){
            SALAR1 = SALAR*(1+0.2);
            SALAR2 = SALAR*(1+0.2);
            SALAR3 = SALAR;
            JOptionPane.showMessageDialog(null, "El salario de los vendedores del departamento 1 es $"+SALAR1+".\nEl salario de los vendedores del departamento 2 es $"+SALAR2+".\nEl salario de los vendedores del departamento 3 es $"+SALAR3+".");
        }
        else if ((VD1 > PORVEN) && (VD2 < PORVEN) && (VD3 > PORVEN)){
            SALAR1 = SALAR*(1+0.2);
            SALAR2 = SALAR;
            SALAR3 = SALAR*(1+0.2);
            JOptionPane.showMessageDialog(null, "El salario de los vendedores del departamento 1 es $"+SALAR1+".\nEl salario de los vendedores del departamento 2 es $"+SALAR2+".\nEl salario de los vendedores del departamento 3 es $"+SALAR3+".");
        }
        else if ((VD1 < PORVEN) && (VD2 > PORVEN) && (VD3 < PORVEN)){
            SALAR1 = SALAR;
            SALAR2 = SALAR*(1+0.2);
            SALAR3 = SALAR;
            JOptionPane.showMessageDialog(null, "El salario de los vendedores del departamento 1 es $"+SALAR1+".\nEl salario de los vendedores del departamento 2 es $"+SALAR2+".\nEl salario de los vendedores del departamento 3 es $"+SALAR3+".");
        }
        else if ((VD1 < PORVEN) && (VD2 < PORVEN) && (VD3 > PORVEN)){
            SALAR1 = SALAR*(1+0.2);
            SALAR2 = SALAR;
            SALAR3 = SALAR*(1+0.2);
            JOptionPane.showMessageDialog(null, "El salario de los vendedores del departamento 1 es $"+SALAR1+".\nEl salario de los vendedores del departamento 2 es $"+SALAR2+".\nEl salario de los vendedores del departamento 3 es $"+SALAR3+".");
        }
        
        else if ((VD1 < PORVEN) && (VD2 > PORVEN) && (VD3 > PORVEN)){
            SALAR1 = SALAR*(1+0.2);
            SALAR2 = SALAR;
            SALAR3 = SALAR*(1+0.2);
            JOptionPane.showMessageDialog(null, "El salario de los vendedores del departamento 1 es $"+SALAR1+".\nEl salario de los vendedores del departamento 2 es $"+SALAR2+".\nEl salario de los vendedores del departamento 3 es $"+SALAR3+".");
        }
   }
}
