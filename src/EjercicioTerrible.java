import java.util.Scanner;

public class EjercicioTerrible {
    public static void main(String[] args) {
        Scanner escanearNumeros = new Scanner(System.in);
        Scanner escanearNombres = new Scanner(System.in);
            float edades=0;
            float promedioEdad=0;
        for (int i = 1; i <=5; i++) {
            System.out.println("Ingrese el nombre del estudiante n°" + i);
            String nombre = escanearNombres.nextLine();
            System.out.println("el nombre del estudiante N°" + i + " es :" + nombre);
            System.out.println("Ingrese la edad del estudiante n° " + i);
            byte edad = escanearNumeros.nextByte();
            edades = edades+edad;
            if (edad>17) {
                System.out.println("el estudiante n° " + i +" es mayor de edad");
            } else {
                System.out.println("el estudiante n° " + i +" es menor de edad");
            }
            if (i==5) {
                promedioEdad=(edades)/5;
                System.out.println("el promedio de las edades de los estudiantes es: " + promedioEdad);
                System.out.println("Programa finalizado.");
            }
        }
        escanearNombres.close();
        escanearNumeros.close();

    }
    
}
