/**
 * Created by Alpit on 15-05-2017.
 */
import java.io.BufferedReader;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.*;




class Pallin
{
    public static void main(String args[]) throws IOException
    {
        char ch;
        int counter=0;
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        String s=read.readLine();
        int strLen=s.length();
        char c[]=new char[strLen];
        for(int i=0;i<c.length;i++)
        {
            s.trim();
            c[i]=s.charAt(i);
        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==c[strLen-i-1])
            {
                counter++;
            }
        }
        if(counter>1)
        {
            System.out.print("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
