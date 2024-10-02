package task3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Passwords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Papka yo'lini ko'rsating:");
        String folderName=scanner.nextLine();
        String fileName="Password.txt";
        File file=new File(folderName,fileName);
        if (file.exists()&&!file.isDirectory()){
        try(BufferedReader bf=new BufferedReader(new FileReader(file))){
            String line;
           Pattern pattern=Pattern.compile("[A-Za-z0-9]{8,}");
            while ((line= bf.readLine())!=null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    System.out.println("Passwords:" + matcher.group());
                }
            }
        }catch (IOException e){
         e.printStackTrace();
        }}else{
            System.out.println("Bunday fayl topilmadi......");
        }
    }
}
