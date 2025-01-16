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
    private final String fileName;
    private final String[] pages;
    public FileSaver() {
        fileName = "C:\\Users\\ghamp\\IdeaProjects\\CSE-220\\src\\tutorialJournal.txt";
        pages = new String[] {
""

        };
    }

    public static void runFileCheck() {
        FileSaver myObj = new FileSaver();
        try {
            File tutorialText = new File(myObj.fileName);

            if (tutorialText.createNewFile()) {
                System.out.println("file created");
                FileWriter tutorialWriter = new FileWriter(myObj.fileName);
                tutorialWriter.write(myObj.pages[0]);
                tutorialWriter.close();

            }
            else {
                System.out.println("adding to file now");
                Files.write(Paths.get(myObj.fileName), (myObj.pages[0]).getBytes(), StandardOpenOption.APPEND);
            }


        } catch (IOException e) {
            System.out.println("oopsie error");
            e.printStackTrace();
        }
        System.out.println("what was added:\n \""+ myObj.pages[0]+"\"");
        System.out.println("\nit was printed into the file: "+myObj.fileName);
    }

}
