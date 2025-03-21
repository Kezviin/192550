import java.util.Scanner;

public class comparacionNombres {
    public static void main(String[] args) {
        Scanner continuarcodigo = new Scanner(System.in);
        Scanner escannerNombres = new Scanner(System.in);
        for (int i = 1; i <=2; i++) {
        System.out.println("Ingrese el primer nombre");
        String nombreUno = escannerNombres.nextLine();
        System.out.println("Ingrese el segundo nombre");
        String nombreDos = escannerNombres.nextLine();
        int comparacionNombres = nombreUno.compareToIgnoreCase(nombreDos);
        if (comparacionNombres<0) {
            System.out.println("El orden alfabetico de los nombres es:");
            System.out.println(nombreUno);
            System.out.println(nombreDos);
        }else if (comparacionNombres>0) {
            System.out.println("El orden alfabetico de los nombres es:");
            System.out.println(nombreDos);
            System.out.println(nombreUno);
        }else {
            System.out.println("los nombres son iguales");
        }
        System.out.println("Quieres Repetir el codigo? Ingrese 1 para repetir y cualquier otro numero para no");
        int continuar = continuarcodigo.nextInt();
        if (continuar==1) {
            System.out.println("el codigo se repite");
            i=1;
        } else {
            System.out.println("Fin del codigo");
            i=3;
        }
        }
        continuarcodigo.close();
        escannerNombres.close();
        
    }
}
