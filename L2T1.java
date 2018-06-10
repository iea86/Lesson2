package by.epam.javabasic25.classes;

import java.util.Scanner;       // imported library Scanner

public class L2T1 {    

    public static void main (String[] args){        // main class
        int n = 10;     // create integer variable, value = 10 
        Scanner sc = new Scanner(System.in);        // create new Scanner object and open input stream
        String max = "", min = "", str = "";        // create new String variables:  min, max , str 
        
        for (int i = 0; i < n; i++){        // start a cycle for variable i from 0 to 10
            System.out.print("> ");        // print the string "> "
            if (sc.hasNextLine()){         // if a string was typed
                str = sc.nextLine();        // read recently typed string into variable str
                if(i == 0){                // if it was the first iteration
                    min = str;             //  min value with current string

                }

                if(str.length() > max.length()){        // if the current string is longer than the length of max string
                    max = str;                          // than this sting is treated as max
                } else if(str.length() < min.length()){     // else if the string  is smaller than this string is min                                                            
                	min = str;      //  current string is min

                }

            }

        }

        System.out.println("max string = " + max + " length = " + max.length());        // print the max string and it's length
        System.out.println("min string = " + min + " length = " + min.length());        // print the min string and it's length

    }

}