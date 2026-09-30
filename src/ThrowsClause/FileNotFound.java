package ThrowsClause;

import java.io.FileWriter;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) {
        String filename="java-course.txt";
        try {
            FileWriter writer=new FileWriter(filename);
            writer.write("this is the best java course");
            writer.flush();
            System.out.println("File written successfuly");
        }
        catch (IOException exception){
            System.out.printf("exception occurred %s\n",exception.getMessage());
        }
    }
}
