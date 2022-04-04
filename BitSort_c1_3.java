import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitSort_c1_3
{
    static int n = 10000000;
    boolean[] bit = new boolean[n+1];
    void initInput()
    {
        FileWriter fw;
        try {
            fw = new FileWriter("input.txt");
            for(int i=1;i<=n;i++)
            {
                fw.write(i + "\n");
            }

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void inputFromFile()
    {
        try {
            BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            String line;
            while((line = fr.readLine()) != null)
            {
                bit[Integer.parseInt(line)] = true;
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) 
    {
        BitSort_c1_3 c1_3 = new BitSort_c1_3();
        c1_3.initInput();
        c1_3.inputFromFile();
        c1_3.bitSort();
    }

    private void bitSort() 
    {
        try {
            FileWriter fw = new FileWriter("output.txt");

            for(int i=0;i<bit.length;i++)
            {
                if(bit[i])
                {
                    fw.write((i) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}