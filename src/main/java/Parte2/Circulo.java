/*
 * Esta clase define objetos de tipo Círculo con su radio como atributo.
 */
package Parte2;

/**
 * @author daniel_krauze
 */
public class Circulo {
    
    //Atributo que define el radio de un círculo.
    int radio;
    
    //Constructor de la clase Círculo.
    Circulo(int radio){
        this.radio = radio;
    }
    
    //* Método que calcula y devuelve el área de un círculo como pi
    //multiplicado por el radio al cuadrado
    double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    
    /**
    * Método que calcula y devuelve el perímetro de un círculo como la
    * multiplicación de pi por el radio por 2
    */
    
    double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
