import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[1000000];
        int len = 0;
        try {
            BufferedReader read = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = read.readLine()) != null) {

                String[] n = line.split(" ");
                len = n.length;
                for (int i=0;i<n.length;i++){
                    numbers[i]=Integer.parseInt(n[i]);

                }
            }
            read.close();
        }
        catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        System.out.println(_min(numbers,len));
        System.out.println(_max(numbers,len));
        System.out.println(_sum(numbers,len));
        System.out.println(_mult(numbers,len));
    }
    public static int _min (int[] numbers, int len){
        int minn = numbers[0];
        for(int i=1;i<len;i++){
            if(numbers[i]<minn) {
                minn = numbers[i];
            }
        }
        return minn;
    }
    public static int _max (int[] numbers, int len){
        int maxx = numbers[0];
        for(int i=1;i<len;i++){
            if(numbers[i]>maxx) {
                maxx = numbers[i];
            }
        }
        return maxx;
    }
    public static int _sum (int[] numbers, int len){
        int summ = 0;
        for(int i=0;i<len;i++){
            summ+=numbers[i];
        }
        return summ;
    }
    public static int _mult (int[] numbers, int len){
        int mult=1;
        for(int i=0;i<len;i++){
            mult=mult*numbers[i];
        }
        return mult;

    }

}