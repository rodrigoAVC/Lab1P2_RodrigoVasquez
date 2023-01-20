package lab1p2_rodrigovasquez;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab1P2_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner beru = new Scanner(System.in);
        int choice;
        do {
            System.out.println("------- < B I E N V E N I D O S > -------");
            System.out.println("1. Torres de Hanói");
            System.out.println("2. Fechas");
            System.out.println("3. Pi");
            System.out.println("4. Salir");
            System.out.println("-----------------------------------------");
            System.out.print("Seleccione que ejercicio desea ejecutar: ");
            choice = beru.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Ingrese la cantidad de discos: ");
                    int n = beru.nextInt();
                    int origen = 1;
                    int auxiliar = 2;
                    int destino = 3;
                    int pasos = 1;
                    hanoi(n, origen, auxiliar, destino, pasos);
                    break;
                case 2:
                    fechas();
                    break;
                case 3:
                    System.out.print("Ingrese un numero: ");
                    int num = beru.nextInt();
                    double answer = 4 * pi(num, 0);
                    System.out.println("La respuesta es: " + answer);
                    break;
                case 4:

            }
        } while (choice != 4 && choice > 0 && choice < 4);
    }

    public static void hanoi(int n, int origen, int auxiliar, int destino, int pasos) {
        if (n == 1) {
            System.out.println(pasos + " Mover disco 1 de " + origen + " a " + destino);
            pasos++;
            return;
        } else {
            hanoi(n - 1, origen, destino, auxiliar, pasos);
            pasos++;
        }
        System.out.println(pasos + " Mover disco " + n + " de " + origen + " a " + destino);
        hanoi(n - 1, auxiliar, origen, destino, pasos + 1);
        pasos++;
        return;
    }

    public static void fechas() {
        Scanner blackBetty = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = blackBetty.next();
        String token[] = cadena.split(",");
        for (int i = 0; i < token.length; i++) {
            if ((token[i].contains("/") || token[i].contains("*") || token[i].contains("-"))) {
                switch (token[i].charAt(2)) {
                    case '/':
                        String token2[] = token[i].split("/");
                        int dia = Integer.parseInt(token2[0]);
                        int mes = Integer.parseInt(token2[1]);
                        int year = Integer.parseInt(token2[2]);
                        Date fecha = new Date(); 
                        fecha.setDate(dia);
                        fecha.setMonth(mes);
                        fecha.setYear(year);
                        System.out.println(fecha);
                        break;
                    case '*':
                        String token3[] = token[i].split("/");
                        int dia2 = Integer.parseInt(token3[0]);
                        int mes2 = Integer.parseInt(token3[1]);
                        int year2 = Integer.parseInt(token3[2]);
                        Date fecha2 = new Date(); 
                        fecha2.setDate(dia2);
                        fecha2.setMonth(mes2);
                        fecha2.setYear(year2);
                        System.out.println(fecha2);
                        break;
                    case '-':
                        String token4[] = token[i].split("/");
                        int dia3 = Integer.parseInt(token4[0]);
                        int mes3 = Integer.parseInt(token4[1]);
                        int year3 = Integer.parseInt(token4[2]);
                        Date fecha3 = new Date(); 
                        fecha3.setDate(dia3);
                        fecha3.setMonth(mes3);
                        fecha3.setYear(year3);
                        System.out.println(fecha3);
                        break;
                }
            }
        }
    }

    public static double pi(int k, int n) {
        if (n == k) {
            return Math.pow(-1, n) / ((2 * n) + 1);
        } else {
            return pi(k, n + 1) + Math.pow(-1, n) / ((2 * n) + 1);
        }
    }
}
