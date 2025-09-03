/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.empresa.control;

import pe.com.emrpesa.modelo.Persona;

/**
 *
 * @author shunn
 */
public class Index {
    
    public static void inicio(){
        
        Persona persona = new Persona("Cerezp", 18, 1.61);
        
        // Mostrar los valores del Objeto
        
        System.out.println("DATOS INGRESADOS");
        System.out.println("* Nombre: " + persona.getNombre());
        System.out.println("* Edad: " + persona.getEdad());
        System.out.println("* Talla: " + persona.getTalla());
        }
    
    public static void main(String[] args) {
        inicio();
    }
}
