package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner teclado = new Scanner (System.in);
    public static void main(String[] args){
        int opc;
        double kg;
        double total;
        EstrategiaEnvio hola = new EnvioEstandar();
        EstrategiaEnvio hola3 = new EnvioInternacional();
        EstrategiaEnvio hola2 = new EnvioExpress();
        do {

            System.out.println("Seleccione una opcion");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:


                    kg = teclado.nextDouble();
                    total = hola.calcp(kg);

                    System.out.println("Total: " + total);
                    break;
                case 2:


                    kg = teclado.nextDouble();
                    total = hola2.calcp(kg);

                    System.out.println("Total: " + total);
                    break;
                case 3:


                    kg = teclado.nextDouble();
                    total = hola3.calcp(kg);

                    System.out.println("Total: " + total);
                    break;
            }
        }while (opc != 0);
    }
}
