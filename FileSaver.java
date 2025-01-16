//Griffin Hampton CSE 220
/*

 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSaver {
    public static void runFileCheck() {
        String fileName = "C:\\Users\\ghamp\\IdeaProjects\\CSE-220\\src\\tutorialJournal.txt";
        String[] pages = {
                ""
        };
        try {
            File tutorialText = new File("src");

            if (tutorialText.createNewFile()) {
                System.out.println("file created");
                FileWriter tutorialWriter = new FileWriter(fileName);
                tutorialWriter.write(pages[0]);
                tutorialWriter.close();

            }
            else {
                System.out.println("adding to file now");
                Files.write(Paths.get(fileName), pages[0].getBytes(), StandardOpenOption.APPEND);
            }


        } catch (IOException e) {
            System.out.println("oopsie error");
            e.printStackTrace();
        }
        System.out.println("it ran");
    }

}
