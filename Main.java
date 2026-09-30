//CREAR UN PROGRAMA QUE DETERMINE EL SALARIO FINAL DE UN TRABAJADOR
// SI es un programador se agrega un 25% al salario total
//Si es doctor se agrega 100 al salario
// si es administrador se agrega un 2% del salario total
// si tiene multa se descueta $15 al salario total
// El programa de recibir nombre y salario del trabajador
import java.util.*;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){

        String nombre;
        double salario=600;
        int opcion;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese el salario base: ");
        salario = entrada.nextDouble();

        System.out.println("###################");
        System.out.println("1. Es programador");
        System.out.println("2. Es médico");
        System.out.println("3. Es administrador");

        System.out.print("Ingrese una opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                salario = salario + (salario * 0.25);
                break;
            case 2:
                salario = salario + 100;
                break;
            case 3:
                salario = salario + (salario * 0.02);
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }

        salario = salario - 15;
        JOptionPane.showMessageDialog(null, "El salario final de " + nombre + " es: " + salario);
    }
}