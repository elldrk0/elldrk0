import java.io.*;
import java.util.*;



public class A_plus_B {
    public static void main(String[] args) throws IOException{
        String str;
        FileReader fin = new FileReader("numbers.txt");
        Scanner sc = new Scanner(fin);
        str = sc.nextLine();
        FileWriter countStepFinish = new FileWriter("answer.txt");
        countStepFinish.write(str);
        countStepFinish.close();
    }
}
