/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class aplicacion {
    
    public static void main (String[] args ){
        
        Scanner lector=new Scanner (System.in);
        System.out.println("ingrese el numero de elementos");
        int n=lector.nextInt();
        int[] Arreglo=new int [n];
        for (int i = 0; i < n; i++) 
        {
            Arreglo[i]=lector.nextInt();
        }
        int menor, mayor;
        menor=mayor=Arreglo[0];
                for (int j = 0; j < n; j++)
                {
                    if (Arreglo[j]>mayor)
                    {
                        mayor=Arreglo[j];
                    }
                    if (Arreglo[j]<menor)
                    {
                        menor=Arreglo[j];
                    }
        int promedio;
        promedio = menor+mayor/2;
        }
        System.out.println("EL ELEMENTO MAYOR :");
        System.out.println(mayor);
        System.out.println("EL ELEMENTO MENOR :");
        System.out.println(menor);
        System.out.println("EL PROMEDIO ES:");
        boolean promedio = false;
        System.out.println(promedio);
    }
}
