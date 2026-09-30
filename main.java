//CREAR UN PROGRAMA QUE DETERMINE EL SALARIO FINAL DE UN TRABAJADOR
// SI es un programador se agrega un 25% al salario total
//Si es doctor se agrega 100 al salario
// si es administrador se agrega un 2% del salario total
// si tiene multa se descueta $15 al salario total
// El programa de recibir nombre y salario del trabajador
import java.util.*;
public class main{
    public static void main(String[] args){

        String nombre;
        double salario;
        int opcion;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("###################");
        System.out.print("1. Es programador");
        System.out.print("2. Es médico");
        System.out.print("3. Es administrador \n");

        System.out.print("Ingrese una opcion: ");
        opcion = entrada.nextInt();

        swich(opcion){
            case1:

            case2:

            case3:
            
        }
    }
}