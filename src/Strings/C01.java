package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Reverse a String
public class C01 {
    // { Driver Code Starts
    //Initial Template for Java
        public static void main(String args[])throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());

            while(t-- >0) {
                String str = read.readLine();
                System.out.println(new Reverse().reverseWord(str));
            }
        }
    // } Driver Code Ends

//User function Template for Java
    static class Reverse
    {
        // Complete the function
        // str: input string
        public static String reverseWord(String str)
        {
            // Reverse the string str
            StringBuilder nstr = new StringBuilder();
            char ch;
            for(int i = 0; i < str.length(); i++){
                ch = str.charAt(i);
                nstr.insert(0, ch);                    //Main logic
            }
            return nstr.toString();

            //Different Approach----------------------------------------------------------------------------------------
            /*StringBuilder newStr = new StringBuilder(str);
            newStr.reverse();
            return newStr;--------------------------------------------------------------------------------------------*/


        }
    }
}
