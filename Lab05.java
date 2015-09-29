/**
 *
 * @author Chad Weireter
 */

import java.util.Scanner;

public class Lab05 {

   
    public static void main(String[] args) {
        
        int carry = 0, dev = 0;
        
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        int[] arrayResult = new int[50];
        
        String Input;
        
        String[] arr = new String[20];
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        
        Input = scan.next();
        
        for(int i = 0; i< Input.length(); i++ )
        {
            arr[i]=Input.substring(i, i+1);
        }
        
        for(int i =0; i< Input.length(); i++)
        {
            array1[i]=Integer.parseInt(arr[i]);
        }
        
        System.out.println("Enter the next number");
        
        Input = scan.next();

        for(int i = 0; i< Input.length(); i++ )
        {
            arr[i]=Input.substring(i, i+1);
        }
        
        for(int i =0; i< Input.length(); i++)
        {
            array2[i]=Integer.parseInt(arr[i]);
        }
        
        for(int i =Input.length()+1; i>=0; i--)
        {
            if(i!=0){
                dev = array1[i]+array2[i]+carry;
                carry = dev/10;
                dev = dev%10;
                arrayResult[i] = dev;
            }
        
        else
        arrayResult[i]=array1[i] + array2[i] + carry;
        }
        
        System.out.println("The sum of the two numbers are: ");
        
        for(int i = 0; i< Input.length(); i++){
            System.out.print(arrayResult[i]);
           
        }
        
       
    }
    
}
