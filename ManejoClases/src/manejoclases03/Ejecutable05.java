/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Ejecutable05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital miHospital= new Hospital();
        
        // Dar atributos 
        // Los valores ingresados por teclado 
        System.out.println("Ingrese el nombre ");
        miHospital.establecerNombre(sc.nextLine());
        System.out.println("Ingrese el numero de camas ");
        miHospital.establecerNumeroCamas(sc.nextInt());
        System.out.println("Ingresar el presupuesto ");
        miHospital.establecerPresupuesto(sc.nextDouble());
        // Presentar los valores del objeto 
        System.out.printf("%s %d %.2f\n ",miHospital.obtenerNombre(),miHospital.obtenerNumeroCamas(),
                miHospital.obtenerPresupuesto());
    }
}
