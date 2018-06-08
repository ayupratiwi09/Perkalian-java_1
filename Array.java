
package array;

import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {  
        int[] kali = new int[100];
        cetakArray(kali);
    }
    
    public static void cetakArray(int[] data){
        Scanner scn = new Scanner (System.in);
        int point=0; 
        for (int i=0; i<data.length;i++)
        {
            System.out.println("Masukkan data ke- " + (i+1));
            data[i]=scn.nextInt();   
            if (data[i]==-1){
                point=i;
                break;
            }
        }      
        int min = data[0];
        int max = data[0];
        System.out.println(" ");
        for(int i=0; i<point; i++)
        {
            if(data[i]>max)
                max = data[i];
            else if (data[i]<min)
                min = data[i];
        }
        
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}   