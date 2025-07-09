package vista;

import controlador.Configuracion;
import controlador.DivisasException;
import modelo.Divisas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void ejecutarMenu (){

        Scanner leerDato = new Scanner(System.in);
        boolean salida=false;
        System.out.println("***************************************************");
        System.out.println("Bienvenido(a) al conversor de monedas\nPor favor elige una de las siguientes opciones:");

        while (!salida) {

            System.out.println("");
            System.out.println("1.- Lista de divisas disponibles");
            System.out.println("2.- Convertir tu moneda");
            System.out.println("3.- Historial de conversiones");
            System.out.println("4.- Salir del programa");
            try {
                System.out.print("\nIngresa el numero de la opción: ");
                int eleccion = leerDato.nextInt();
                leerDato.nextLine();

                switch (eleccion) {
                    case 1:
                        System.out.println("Tablero generado");
                        Configuracion.mostrarMap();
                        break;

                    case 2:
                        try {
                            System.out.println("Ingrese el nombre de tu moneda base");
                            String money_base = leerDato.nextLine().trim().toUpperCase();

                            System.out.println("Ingresa el nombre de la moneda que quieras convertir");
                            String money_conversor = leerDato.nextLine().trim().toUpperCase();

                            System.out.println("Ingresa el monto que deseas convertir");
                            int valor_join = Integer.parseInt(leerDato.nextLine());

                            if (valor_join <= 0) {
                                throw new DivisasException("El monto debe ser mayor que cero");
                            }

                            Divisas result = Configuracion.conversorDivisa(money_base, money_conversor, valor_join);
                            if (result == null) {
                                System.out.println("Divisa erronea. Por favor ingresar el pais indicado en la lista");
                            } else {
                                System.out.println(result);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(" Error: Por favor ingresar un número válido para el monto");
                        } catch (Exception e) {
                            System.out.println(" Error inesperado: " + e.getMessage());
                        }
                        break;

                    case 3:
                        break;

                    case 4:
                        System.out.println("Haz finalizado el programa correctamente. ¡Hasta pronto!");
                        salida = true;
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor ingresar un número entero válido.");
                leerDato.nextLine();
            }
        }
    }
}
