/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Isabel Flores Tello
 */

public class EcuacionDeSegundoGrado {
    double a;
    double b;
    double c;
public EcuacionDeSegundoGrado(double a, double b, double c){
    this.a=a;
    this.b=b;
    this.c=c;
}
public double getCoeficienteA(){
    return this.a;
}
public double getCoeficienteB(){
    return this.b;
}
public double getCoeficienteC(){
    return this.c;
}
public double getDiscriminante(){
    double Discriminante;
    Discriminante = Math.pow (b, 2) - (4 * a * c);
    return Discriminante;
}
public int getNumeroDeSoluciones(){
    int numeroDeRaices;
    double d = getDiscriminante();
        if (d > 0){
            numeroDeRaices = 2;
        }
        else if (d < 0){
    numeroDeRaices = 0;
}
        else {
            numeroDeRaices = 1;
        }
        return numeroDeRaices;
}
public double getRaiz1(){
    double raiz1;
    raiz1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    return raiz1;
}
public double getRaiz2(){
double raiz2;
raiz2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
return raiz2;
}

    
    }