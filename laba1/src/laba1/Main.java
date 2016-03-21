package laba1;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = Integer.valueOf(args[1]);
		int count = Integer.valueOf(args[2]);
		int stop = start + count;
		try(Scanner in = new Scanner(new File(args[0])))
        {
           int i = 0;
           while(in.hasNext() && (i < stop)){
                if((i >= start) && (i < stop)) {
                	System.out.println(in.nextLine());
                }
                else{
                	in.nextLine();
                }
                i++;
           }
                
        }
        
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
	}

}