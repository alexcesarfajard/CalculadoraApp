package calculadoraapp;

import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        float num1 = 0;
        float num2 = 0;

        while (opc != 5) {

            //mostramos el menu
            mostrarmenu();

            //Leemos la opcion elegida por el usuario
            try {
                opc = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error, " + e.getMessage());
                opc = 99;
            }

            //Pedimos los numeros si la opcion elegida es correcta
            if (opc >= 1 && opc <= 4) {
                try { //Buscamos como evitar que la app se cierre por error en input
                    System.out.print("Ingrese el primer numero: ");
                    num1 = Float.parseFloat(sc.nextLine());
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = Float.parseFloat(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Ha ocurrido un error, " + e.getMessage());
                    opc = 99;
                }
            }

            switch (opc) {
                case 1:
                    funcSuma(num1, num2, sc);
                    break;
                case 2:
                    funcResta(num1, num2, sc);
                    break;
                case 3:
                    funcMultiplicacion(num1, num2, sc);
                    break;
                case 4:
                    funcDivision(num1, num2, sc);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar esta aplicacion!! Vuelva pronto");
                    break;
                default:
                    System.out.print("\nNo se ha elegido una opcion correcta... Vuelva a intentarlo\n");
                    presEnter();
                    sc.nextLine();
                    break;
            } //ciera switch de menu principal
        }//cierra ciclo while
    } //cierra main

    private static void mostrarmenu() {
        System.out.print("\n\n*** CalculadoraApp ***\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Ingrese la operación que deseas realizar: ");
    }

    private static void presEnter() {
        System.out.print("Presione enter para continuar...");
    }

    private static void funcSuma(float num1, float num2, Scanner sc) {
        System.out.println("El resultado de la suma es: " + (num1 + num2));
        presEnter();
        sc.nextLine();
    }

    private static void funcResta(float num1, float num2, Scanner sc) {
        System.out.println("El resultado de la resta es: " + (num1 - num2));
        presEnter();
        sc.nextLine();
    }

    private static void funcMultiplicacion(float num1, float num2, Scanner sc) {
        System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
        presEnter();
        sc.nextLine();
    }

    private static void funcDivision(float num1, float num2, Scanner sc) {
        System.out.println("El resultado de la division es: " + (num1 / num2));
        presEnter();
        sc.nextLine();
    }
} // cierra clase principal
