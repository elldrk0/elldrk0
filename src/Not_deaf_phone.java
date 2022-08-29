import java.io.*;
import java.util.*;


public class Not_deaf_phone {
    public static void main(String[] args) throws IOException{ //волшебная комманда для отсеивания ошибок
        String string_variable; //обьявление переменной типа стринг
        FileReader file_input_variable = new FileReader("input_1.txt"); //считывание из файла в переменную файл_инпут...
        Scanner scanner_variable = new Scanner(file_input_variable);//сканирует текст из переменной для обработки
        string_variable = scanner_variable.nextLine();
        FileWriter counterStepFinish = new FileWriter("output_1.txt");//выводит из переменной текст в файл
        counterStepFinish.write(string_variable);
        counterStepFinish.close();
    }

}
