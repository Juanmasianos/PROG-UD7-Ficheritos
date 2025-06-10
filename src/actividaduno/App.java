package actividaduno;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            FileWriter writer = new FileWriter("./src/actividaduno/file/fichero.txt", StandardCharsets.UTF_8);

            System.out.println("Escriba una cadena de caracteres de al menos 30 caracteres");

            String newString;

            do {

                newString = scanner.nextLine();

                if (newString.length() < 30) {

                    System.out.println("te faltaron " + (30 - newString.length())
                            + " caracteres vuelve a introducir otra cadena: ");

                }
                
            } while (newString.length() < 30);

            scanner.close();

            newString = newString.replaceAll(" ", "_");
            newString = newString.toUpperCase();

            writer.write(newString);
            writer.flush();

            writer.close();

        } catch (NoSuchElementException e) {

            System.out.println("Ha cancelado la escritura del programa");

        } catch (FileNotFoundException e) {

            System.out.println("No se ha encontrado el fichero");

        } catch (IOException e) {

            System.out.println("Ha ocurrido un error al escribir el fichero\n" + e);

        }

    }
}
