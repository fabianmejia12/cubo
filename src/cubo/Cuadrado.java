/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

/**
 *
 * @author Fabián
 */
public class Cuadrado {
    //Aca solo aremeos los calculos del cubo
public double x;

    public  Cuadrado(double lado) //de una cara
    {
        this.x =  lado;
    }




    public  double calculateArea(){//Area
        return this.x * this.x;
    }

    public  double calculatePerimeter()//Perimetro
    {
        return this.x *4;
    }
}

