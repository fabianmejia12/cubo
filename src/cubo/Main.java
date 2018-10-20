/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

import java.util.Scanner;

/**
 *
 * @author Fabián
 */
public class Main {
    static Cubo cubo;
    static double current;//nombre de mis variables
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    
Scanner scanner = new Scanner(System.in);//como siempre un scanner


        init ();


        loop ();


        scanner.nextLine();


    }


    private static void loop(){

        int  opt =get_menu();//desplega el menu

        while(opt != 5)
        {
            current = calculate(opt ,cubo);

            System.out.println("El valor es " +current+ "\n");

            opt = get_menu ();
        }



        init ();
        loop ();
    }


    private static void init(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado:\t");//pedicion de valores
        try{//por si hay un error
            double lado  = Double.parseDouble( scanner.nextLine());
            cubo = new Cubo(lado);
        }
        catch (NumberFormatException nfe){
            System.out.println ("El valor debe de ser un entero");
            init ();
        }



    }


    public static double calculate( int opt, Cubo cubo){//Menu

        double result = 0;
        switch (opt){
            case 1: result =cubo.calculatePerimeter(true); break;
            case 2: result = cubo.calculateArea (); break;
            case 3: result = cubo.calculateVolume(); break;
            case 4: result = cubo.calculatePerimeter(false); break;
            case 5: init();break;
            case 6: System.out.println ("Gracias por probarme");System.exit (0);break;//envio a cada clase

        }
        return result;
    }

    public static int get_menu(){//accion del menu
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Ingrese el calculo a realizar:\n");
        System.out.print ("1: Perímetro cuadrado \n");
        System.out.print ("2: calcular área\n");
        System.out.print ("3: calcular Volúmen\n");
        System.out.print ("4: calcular Perímetro cubo\n");
        System.out.print ("5: Reinicio \n");
        System.out.print ("6: Salir del programa \n");

        int opt  = Integer.parseInt( scanner.nextLine());
        return opt;
    }



}
