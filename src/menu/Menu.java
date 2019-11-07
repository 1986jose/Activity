package menu;
import java.io.*;
/**
 *
 * @author Medina
 */
public class Menu {

    int opcion;
    float li, ld, BM, bm, h, area, perimetro, lado, base, lado1, lado2, lado3, radio, pi = (float) 3.1416;

    public static void main(String[] args) throws IOException {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Menu tecl = new Menu();

        System.out.println("*Menu para el calculo del Area y Perimetro de figuras geometricas*");
        System.out.println("\nOpciones...\n");
        System.out.println("[1] Trapecio");
        System.out.println("[2] Cuadrado");
        System.out.println("[3] Rectangulo");
        System.out.println("[4] Triangulo");
        System.out.println("[5] Circulo");
        System.out.println("\nDigite su opcion: ");
        do {
            try {
                tecl.opcion = Integer.parseInt(leer.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                System.out.println("Digite su opcion: ");
            }
        } while (true);
        if (tecl.opcion >= 1 || tecl.opcion <= 5) {
            switch (tecl.opcion) {
                case 1: {
                    System.out.println("\n*TRAPECIO*\n");
                    System.out.println("Digite el valor del lado izquierdo: ");
                    do {
                        try {
                            tecl.li = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor del lado izquierdo: ");
                        }
                    } while (true);
                    System.out.println("Digite el valor del lado derecho: ");
                    do {
                        try {
                            tecl.ld = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor del lado derecho: ");
                        }
                    } while (true);
                    System.out.println("Digite el valor de la base mayor: ");
                    do {
                        try {
                            tecl.BM = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor de la base mayor: ");
                        }
                    } while (true);
                    System.out.println("Digite el valor de la base menor: ");
                    do {
                        try {
                            tecl.bm = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor de la base menor: ");
                        }
                    } while (true);
                    System.out.println("Digite el valor de la altura: ");
                    do {
                        try {
                            tecl.h = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor de la altura: ");
                        }
                    } while (true);
                    tecl.area = ((tecl.bm + tecl.BM) * tecl.h) / 2;
                    tecl.perimetro = tecl.li + tecl.ld + tecl.BM + tecl.bm;
                    System.out.println("\nEl Area del Trapecio es: " + tecl.area);
                    System.out.println("El Perimetro del Trapecio es: " + tecl.perimetro);
                    break;
                }
                case 2: {
                    System.out.println("\n*CUADRADO*\n");
                    System.out.println("Digite el valor del lado: ");
                    do {
                        try {
                            tecl.lado = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor del lado: ");
                        }
                    } while (true);
                    tecl.area = tecl.lado * tecl.lado;
                    tecl.perimetro = tecl.lado * 4;
                    System.out.println("\nEl Area del cuadrado es: " + tecl.area);
                    System.out.println("El Perimetro del cuadrado es: " + tecl.perimetro);
                    break;
                }
                case 3: {
                    System.out.println("\n*RECTANGULO*\n");
                    System.out.println("Digite el valor de la base: ");
                    do {
                        try {
                            tecl.base = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor de la base: ");
                        }
                    } while (true);
                    System.out.println("Digite el valor de la altura: ");
                    do {
                        try {
                            tecl.h = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor de la altura: ");
                        }
                    } while (true);
                    tecl.area = tecl.base * tecl.h;
                    tecl.perimetro = (2 * tecl.base) + (2 * tecl.h);
                    System.out.println("\nEl Area del Rectangulo es: " + tecl.area);
                    System.out.println("El Perimetro del Rectangulo es: " + tecl.perimetro);
                    break;
                }
                case 4: {
                    System.out.println("\n*TRIANGULO*\n");
                    System.out.println("Digite el valor del lado 1: ");
                    do {
                        try {
                            tecl.lado1 = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor del lado 1: ");
                        }
                    } while (true);
                    System.out.println("Digite el valor del lado 2: ");
                    do {
                        try {
                            tecl.lado2 = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor del lado 2: ");
                        }
                    } while (true);
                    System.out.println("Digite el valor del lado 3: ");
                    do {
                        try {
                            tecl.lado3 = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor del lado 3: ");
                        }
                    } while (true);
                    System.out.println("Digite el valor de la base: ");
                    do {
                        try {
                            tecl.base = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor de la base: ");
                        }
                    } while (true);
                    System.out.println("Digite el valor de la altura: ");
                    do {
                        try {
                            tecl.h = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor de la altura: ");
                        }
                    } while (true);
                    tecl.area = (tecl.base * tecl.h) / 2;
                    tecl.perimetro = tecl.lado1 + tecl.lado2 + tecl.lado3;
                    System.out.println("\nEl Area del Triangulo es de: " + tecl.area);
                    System.out.println("El Perimetro del Triangulo es de: " + tecl.perimetro);
                    break;
                }
                case 5: {
                    System.out.println("\n*CIRCULO*\n");
                    System.out.println("Digite el valor del radio: ");
                    do {
                        try {
                            tecl.radio = Float.parseFloat(leer.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\n*ERROR*...(Digite unicamente numeros)");
                            System.out.println("Digite el valor del radio: ");
                        }
                    } while (true);
                    tecl.area = (float) (tecl.pi * (tecl.radio * tecl.radio));
                    tecl.perimetro = (2 * tecl.pi) * tecl.radio;
                    System.out.println("\nEl Area del Circulo es: " + tecl.area);
                    System.out.println("El Perimetro del Circulo es: " + tecl.perimetro);
                    break;
                }
            }
        } else {
            System.out.println("*OPCION FUERA DE RANGO, CORRA NUEVAMENTE EL PROGRAMA");
        }
    }
}
