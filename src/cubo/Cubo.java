/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

/**
 *
 * @author guada
 */
public class Cubo extends Cuadrado
{

    public double x;

    public Cubo(double lado) {
        super(lado);

        this.x = lado;
    }


    public  double calculateVolume(){//Voumen
        return Math.pow(this.x,3);
    }


    public   double calculatePerimeter(boolean is_super)
    {

        if (is_super){
           return super.calculatePerimeter ();//desplegue delperimetro
        }
        else{
            return this.x*12;
        }


    }
}
