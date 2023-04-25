package chatp;

import java.io.*;
import java.util.*;

public class chatp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        System.out.print("Ingrese su nombre: ");
        name = sc.nextLine();

        while (true) {
           
            System.out.println("\nSeleccione una opción: ");
            System.out.println("1. Escribir mensaje");
            System.out.println("2. Leer mensajes");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int option = sc.nextInt();

            if (option == 1) {
             
                sc.nextLine(); 
                System.out.print("Escriba su mensaje: ");
                String message = sc.nextLine();
                try {
                  
                    FileWriter writer = new FileWriter("chat.txt", true);
                    writer.write(name + ": " + message + "\n");
                    writer.close();
                    System.out.println("Mensaje enviado correctamente");
                } catch (IOException e) {
                    System.out.println("Error al enviar el mensaje");
                }
            } else if (option == 2) {
                // Leer mensajes
                try {
                  
                    FileReader reader = new FileReader("chat.txt");
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error al leer los mensajes");
                }
            } else if (option == 3) {
               
                break;
            } else {
                
                System.out.println("Opción inválida");
            }
        }

        System.out.println("Saliendo del programa...");
    }
}