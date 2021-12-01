/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Taller8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
       
       
        String nombre;
        String apellido; 
        String cadenaAcumuladora = "Nombre de Padre de Familia: ";
        int sueldo;
        int num_hijos = 3;
        boolean bandera = true; 
        double gasto_1 = 0;
        double gasto_2 = 0;
        double gasto_3 = 0;
        double total_hijos = 0;
        double resultado;
        String valor1 = "alcanza";
        String valor2 = "falta";
        String valor;
        while (bandera){
            
        System.out. println("Ingrese su nombre");
        nombre = entrada.nextLine();
        
        System.out. println("Ingrese su apellido");
        apellido = entrada.nextLine();
        
        System.out. println("Ingrese su sueldo semanal");
        sueldo = entrada.nextInt();
        
        System.out. println("Ingrese su número de hijos");
        num_hijos = entrada.nextInt();
        
        if (num_hijos == 3){
        
        System.out. println("Ingrese los gastos de su hijo 1");
        gasto_1 = entrada.nextDouble();
        
        System.out. println("Ingrese los gastos de su hijo 2");
        gasto_2 = entrada.nextDouble();
        
        System.out. println("Ingrese los gastos de su hijo 3");
        gasto_3 = entrada.nextDouble();}
        
        total_hijos = gasto_1 + gasto_2 + gasto_3;
        resultado = sueldo - total_hijos;
        
        if (resultado > 0){
            valor = valor1;
        }else{
           valor = valor2;
        }
        entrada.nextLine();
        System.out.println("Ingrese si para salir");
        String temporal = entrada.nextLine();
        if (temporal.equals("si") || temporal.equals("Si"))
                bandera = false;
        
        cadenaAcumuladora = String.format("Nombre de Padre de Familia: "
                ,cadenaAcumuladora);
        cadenaAcumuladora = String.format("%s%s ",cadenaAcumuladora, apellido);
        cadenaAcumuladora = String.format("%s%s",cadenaAcumuladora, nombre);
        cadenaAcumuladora = String.format("%s Sueldo Semanal:$ %s",
                cadenaAcumuladora, sueldo);
        cadenaAcumuladora = String.format("%s Número de Hijos: %s\n",
                cadenaAcumuladora, num_hijos); 
        cadenaAcumuladora = String.format("%s Reporte de Gastos\n • Hijo 1, "
                + "gasto semanal $ %s", cadenaAcumuladora, gasto_1);
        cadenaAcumuladora = String.format("%s\n • Hijo 2, gasto semanal $ %s", 
                cadenaAcumuladora, gasto_2);
        cadenaAcumuladora = String.format("%s\n • Hijo 3, gasto semanal $ %s", 
                cadenaAcumuladora, gasto_3);
        cadenaAcumuladora = String.format("%s\n Total gasto en hijos: %.1f", 
                cadenaAcumuladora, total_hijos);
        cadenaAcumuladora = String.format("%s\n El padre de familia %s %s le %s "
                + "el dinero\n\n", cadenaAcumuladora, apellido, nombre, valor);
        
        System.out.println("Reporte de Gastos de Padres de Familia");
        System.out.println (cadenaAcumuladora);
        

        
    }
    }
}
