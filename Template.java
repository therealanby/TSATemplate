import java.util.*;
import java.io.*;

public class Template {
   
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    static PrintWriter pw = new PrintWriter(System.out,true);
   
    static StringTokenizer st;
   
    public static void main(String[] args){
        try{
            run();
            pw.close();
            br.close();
        }catch(IOException IOE){
          pw.println("Error with I/O");
        }catch(NumberFormatException NFE){
          pw.println("Invalid Input");
        }catch(Exception E){
          pw.println("Something went wrong.");
        }
    }
  
    public static void run() throws IOException{
      
    }

    public static void solve(){

    }
}
