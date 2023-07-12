import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Filehand {
    // code to create a file
    public static void main(String args[]) {
        /*
        // creating a  file object
        File myfile = new File("shikhafile.txt");
        // obj.createNewFile call
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println(" unable to create file");
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    // code to write in file  shikhafile
        try {
            FileWriter fileWriter = new FileWriter("shikhafile.txt");
            fileWriter.write(" this is my first file in Shikhafile.txt \n second line");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(" unable to write file");
            e.printStackTrace();
            throw new RuntimeException(e);
        }

 */
        //2. Reading a file

       /* File myfile = new File("C:\\Users\\SHIKHA\\IdeaProjects\\leaningJava\\src\\shekhu.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(" unable to read file");
            throw new RuntimeException(e);
        } */

        //4. deleting a file
        File myfile= new File("C:\\Users\\SHIKHA\\IdeaProjects\\leaningJava\\src\\shekhu.txt");
        if(myfile.delete()) {
            System.out.println("I have deleted " + myfile.getName());
        }
        else {
            System.out.println(" some error occurred");
        }
    }
}
