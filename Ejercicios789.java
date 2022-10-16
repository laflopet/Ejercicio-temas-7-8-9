import java.io.*;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejercicios789 {
public static String reverse(String texto){
    String respuesta = "";
    for (int i = texto.length() - 1; i <= 0; i--){
        char valor = texto.charAt(i);
        respuesta += valor;
    }
    return respuesta;
}
    public static void main(String[] args) {
        System.out.print(reverse("Hola mundo"));

        String ArrayUni[] = {"Jorge", "Juana", "Pabla", "Georgina"};
        System.out.println("\n" + "\nArray Unidimencional");
        for (int i = 0; i < ArrayUni.length; i++) {
            System.out.println(ArrayUni[i]);
        }
        System.out.println("\nArray bidimencional");
        int enteros[][] = {
                {1,2,3,4,5},
                {10,20,30,40}
        };

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Numero de la fila: " + i);
            for (int j = 0; j < enteros[0].length - 1; j ++){
                System.out.println("pocicion de la fila: " + i + " pocicion de la columna: " + j + " Valor de la pocicion: " + enteros[i][j]);
            }
        }
        System.out.println("\n" + "Vectores");
        Vector<String> vector = new Vector<>();
        vector.add(0,"Luz en la oscuridad");
        vector.add(1,"Pronto el Señor vendra");
        vector.add(2,"Pronto Jesus Volvera");
        vector.add(3,"Maranatha");
        vector.add(4,"Cristo viene pronto! preparate.");
        System.out.println(vector);
        vector.remove(1);
        vector.remove(2);
        System.out.println(vector);
        // Se copiarian muchas veces los datos que componen el vector, lo que supone una gran carga
        // computacional y puede hacer mas lento el sistema.

        System.out.println("\nArrayList de tipo String");
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Programador");
        arrayList.add("Diseñador");
        arrayList.add("Marketing");
        arrayList.add("CEO");

        LinkedList <String> nuevoArray = new LinkedList<>(arrayList);
        System.out.println(nuevoArray);

        System.out.println("\nArrayList de tipo int: Eliminando numeros pares");
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\nError en el codigo 'throws'");
        try {
            System.out.println(dividePorCero(2));
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }
        System.out.println("\nCopiar un archivo que esta en el sistema en uno nuevo creado a traves de la funcion PrintStream");

        try {
            InputStream fileln = new FileInputStream("C:/CURSOS/JAVA/Entrega de ejercicios 7 8 y 9/fichero.txt");
            byte[] data = fileln.readAllBytes();
            for (byte dat : data){
                System.out.print((char)(dat));
            }

            PrintStream fileout = new PrintStream("fichero2.txt");
            fileout.write(data);
        }catch (Exception e ){
            System.out.println("El fichero no pudo ser leido");
        }
    }
    public static int dividePorCero(int a) {
        return a / 0;
    }
}
