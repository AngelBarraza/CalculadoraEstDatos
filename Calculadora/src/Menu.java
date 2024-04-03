import java.util.Scanner;

public class Menu {
    public static void Opciones() {
        int op = 0;
        Scanner leer = new Scanner(System.in);
        while (op != 6) {
            System.out.println("Calculadora");
            System.out.println("1- Opción para sumar");
            System.out.println("2- Opción para restar");
            System.out.println("3- Opción para multiplicar");
            System.out.println("4- Opción para dividir");
            System.out.println("5- Opción para el resto");
            System.out.println("6- Salir.");
            op = leer.nextInt();
            while (op < 1 || op > 6) {
                System.out.println("Solo se pueden escoger las opciones mostradas.");
                op = leer.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.print("Operación suma.");
                    System.out.print("Ingrese el primer numero: ");
                    float x = leer.nextFloat();
                    System.out.print("Ingrese el segundo numero.");
                    float y = leer.nextFloat();
                    float z= Operaciones.Suma(x, y);
                    System.out.print(x+"+"+y+"="+z);
                    break;
                case 2:
                    System.out.print("Operación resta.");
                    System.out.print("Ingrese el primer numero: ");
                    float x = leer.nextFloat();
                    System.out.print("Ingrese el segundo numero.");
                    float y = leer.nextFloat();
                    float z=Operaciones.Resta(x, y);
                    System.out.print(x+"-"+y+"="+z);
                    break;
                case 3:
                    System.out.print("Operación multiplicar.");
                    System.out.print("Ingrese el primer numero: ");
                    float x = leer.nextFloat();
                    System.out.print("Ingrese el segundo numero.");
                    float y = leer.nextFloat();
                    float z=Operaciones.Multiplicacion(x, y);
                    System.out.print(x+"*"+y+"="+z);
                    break;
                case 4:
                    System
                    break;
                case 5:

                    break;
            }
        }

    }

}
