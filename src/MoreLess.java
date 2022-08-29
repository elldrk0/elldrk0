import java.io.*;
import java.util.*;

public class MoreLess {
    public static void main(String[] args) throws IOException{
        String symbol;
        ArrayList<Integer> number = new ArrayList<>();
        String str_v;
        FileReader fin_v = new FileReader("input_2.txt");
        Scanner sc_v = new Scanner(fin_v);
        while (sc_v.hasNext()) {
            str_v = sc_v.nextLine();
            number.add(Integer.valueOf(str_v));
        }
        symbol = (number.get(0) > number.get(1)) ? ">" :
                (number.get(0) < number.get(1)) ? "<" : "=";
        FileWriter fout_v = new FileWriter("output_2.txt");
        fout_v.write(symbol);
        fout_v.close();
    }

}
