package Strings;

import java.util.Scanner;

public class jagged_array {

	public static void main(String[] args)
    {
        
        int arr[][] = new int[4][];
        arr[0] =new int[]{40,80,30,99};
        arr[1] =new int[]{20,55};
        arr[2]=new int[]{31,44,55,67};
        arr[3]=new int[]{87,45,66};

        int pass=0;
        int fail=0;
        for (int i = 0; i < arr.length; i++){
            for (int j:arr[i])
            {
                if(j>=40){
                    pass++;
                }
                else{
                    fail++;
                }
            }
        }
        System.out.println("Student passed in "+pass+" subjects");
        System.out.println("Student failed in "+fail+" subjects");
        
    }
}

