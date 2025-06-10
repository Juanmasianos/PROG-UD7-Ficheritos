package actividaddos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        File fileTwo = new File("./src/actividaddos/file/ficherodos.txt");

        Scanner scanner = new Scanner(System.in);

        try (FileInputStream fInStream = new FileInputStream(fileTwo)) {

            for (int i = 0; i < fileTwo.length(); i++) {

                char currentChar = (char) fInStream.read();

                if (currentChar != ' ') {

                    System.out.print(currentChar + "_" + (int) currentChar + ", ");
                    
                }

            }

        } catch (FileNotFoundException e) {

            System.out.println("No se ha encontrado el fichero");

        } catch (IOException e) {

            System.out.println("Ha ocurrido un error al escribir el fichero\n" + e);

        }

        scanner.close();

    }
}
