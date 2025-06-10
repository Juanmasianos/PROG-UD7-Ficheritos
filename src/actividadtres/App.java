package actividadtres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        
        File file = new File("./src/actividaduno/file/fichero.txt");
        File fileTwo = new File("./src/actividaddos/file/ficherodos.txt");
        File fileThree = new File("./src/actividadtres/files/ficherotres.txt");

        String firstFile = "";
        String secondFile = "";

        try (FileReader reader = new FileReader(file)) {

            String fileString = "";

            for (int i = 0; i < file.length(); i++) {
                
                fileString += (char) reader.read();

            }

            firstFile = "- Contenido del fichero uno: " + fileString + "\n";

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("No se ha encontrado el fichero");

        } catch (IOException e) {

            System.out.println("Ha ocurrido un error al escribir el fichero\n" + e);

        }

        try (FileReader reader = new FileReader(fileTwo)) {

            String fileString = "";

            for (int i = 0; i < fileTwo.length(); i++) {
                
                fileString += (char) reader.read();

            }

            secondFile = "- Contenido del fichero dos: " + fileString + "\n";

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("No se ha encontrado el fichero");

        } catch (IOException e) {

            System.out.println("Ha ocurrido un error al escribir el fichero\n" + e);

        }


        try (FileWriter writer = new FileWriter(fileThree)) {

            String thirdFile = firstFile.concat(secondFile) + "\n\n Hecho por Juan Manuel :D";

            writer.write(thirdFile);
            writer.flush();

            writer.close();

        } catch (FileNotFoundException e) {

            System.out.println("No se ha encontrado el fichero");

        } catch (IOException e) {

            System.out.println("Ha ocurrido un error al escribir el fichero\n" + e);

        }
        
    }
}
