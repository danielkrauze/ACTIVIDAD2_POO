/*
 * Esta clase define objetos de tipo Cuadrado con un lado como atributo.
 */
package Parte2;

/**
 *
 * @author daniel_krauze
 */
public class Cuadrado {
    //Definimos el atributo lado para la clase Cuadrado.
    int lado;
    
    //Definimos el constructor de la clase Cuadrado
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    //Método que calcula y devuelve el área del cuadrado:
    double calcularArea(){
        return lado*lado;
    }
    //Método para calcular el perímetro del Cuadrado:
    double calcularPerimetro(){
        return (4*lado);
    }
}
