import java.io.*;
import java.util.*;


public class Beads {
    public static void main(String[] args) throws IOException{
        int numbers;
        String string_variable;
        FileReader file_input_variable = new FileReader("input_1.txt");
        Scanner scanner_variable = new Scanner(file_input_variable);
        string_variable = scanner_variable.nextLine();
        numbers = Integer.valueOf(string_variable) + 1;
        FileWriter file_output_variable = new FileWriter("output_1.txt");
        file_output_variable.write(String.valueOf(numbers));
        file_output_variable.close();


    }

}
