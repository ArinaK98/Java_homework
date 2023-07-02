package DZ_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_4_jason {
    static Logger logger;
    public static void main(String[] args) {
        String filePath = "DZ_2/json.txt";
        String jornal = readInFile(filePath);

        jornal = jornal.replace("{","");
        jornal = jornal.replace("}","");
        jornal = jornal.replace("[","");
        jornal = jornal.replace("]","");
        jornal = jornal.replace("\\","");
        jornal = jornal.replace("\"","");
        jornal = jornal.replace("+","");
        jornal = jornal.replace(":",",");
        jornal = jornal.replace(","," ");
        jornal = jornal.replace("фамилия","Студент");
        jornal = jornal.replace("оценка","получил");
        jornal = jornal.replace("предмет","по предмету");

        String [] words = jornal.split("Студент");
        
        StringBuilder stringBuilder = new StringBuilder();
        for (String student : words){
            System.out.println(student);
            stringBuilder.append(student);
            }
        String toFile = stringBuilder.toString();
        createLogger();
        writeToFile(toFile, filePath);
        closeLogger();
    }

            
    private static void closeLogger() {
        for (Handler handler: logger.getHandlers()){
            handler.close();
        }
    }

    private static void createLogger() {
        logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        if (fileHandler != null){
            fileHandler.setFormatter(formatter);
        }
    }

    static String readInFile(String filePath) {
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static void writeToFile(String toFile, String filePath) {

        try (FileWriter writer = new FileWriter("DZ_2/json.txt")){
            writer.write(toFile);
            writer.write("\n");
            writer.flush();
            logger.info("Запись успешно выполнена");
        } catch (Exception e){
            e.printStackTrace();
            logger.warning("Не удалось записать в файл");
        }
    }  
    
}

//         jornal = jornal.replace("{","");
//         jornal = jornal.replace("}","");
//         jornal = jornal.replace("[","");
//         jornal = jornal.replace("]","");
//         jornal = jornal.replace("\\","");
//         jornal = jornal.replace("\"","");
//         jornal = jornal.replace("+","");
//         jornal = jornal.replace(":",",");
//         jornal = jornal.replace(","," ");
//         jornal = jornal.replace("фамилия","Студент");
//         jornal = jornal.replace("оценка","получил");
//         jornal = jornal.replace("предмет","по предмету");