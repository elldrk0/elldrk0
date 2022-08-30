import java.io.*;


public class TaskCycles {
    public static void main(String[] args) throws Exception {
        int k1 = 1;
        int k2 = 9;
        newFile(k1,k2);
        newFileHouko();
    }

    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("1.txt");
        for (int i = k1; i <= k2; i++){
            nFile.write(i);
        }
        nFile.close();
    }

    public static void newFileHouko() throws Exception {
        FileWriter fr = null;
        try {
            fr = new FileWriter("TextExample.txt",true);
            fr.write("\nХокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fr.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
