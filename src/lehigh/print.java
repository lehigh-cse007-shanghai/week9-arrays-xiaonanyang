package lehigh;

import java.util.ArrayList;
import java.util.Scanner;

public class print {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int i=0;
        int num = 1;
        System.out.println("What is your number :" );
        i=s.nextInt();
        ArrayList <Integer> print=new ArrayList();
        for(int p=1;p<i;p++) {
            print.add(p);
        }
        for(int p=i;p>0;p--){
            print.add(p);
        }
        for(int k=1;k<=i;k++){
            for (int j=0;j<print.size();j++){
                if(print.get(j)>=k+1){
                    System.out.print(" "+" ");
                }
                else{
                    System.out.print(print.get(j)+" ");
                }
                }
            System.out.println();

            }
        }
    }

