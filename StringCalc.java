/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewClalc;

import java.util.Scanner;

/**
 *
 * @author Earring
 */
public class StringCalc {
   public static void main(String[]agrs){
   Scanner read = new Scanner(System.in);
     
   System.out.println("Введите выражене :");
        if (read.findInLine("\"(.*)\"([+])\"(.*)\"")
            != null){
               String x = read.match().group(1);
               String y = read.match().group(3);
               String z = read.match().group(2);
               String s = add (x,y,z);
                if((s.length()<=40)&(x.length()<11)&(y.length()<11)){
                   System.out.println(s);
                }
                else if (s.length()>40){
                   System.out.println(s.substring(0,40)+"...");
                   }
                else {
                   System.out.println("Ошибка");
                   }
           }
        else if (read.findInLine("\"(.*)\"([-])\"(.*)\"")
            != null){
               String x = read.match().group(1);
               String y = read.match().group(3);
               String z = read.match().group(2);
               String s = sub (x,y,z);
                if((s.length()<=40)&(x.length()<11)&(y.length()<11)){
                   System.out.println(s);
                }
                else if (s.length()>40){
                   System.out.println(s.substring(0,40)+"...");
                   }
                else {
                   System.out.println("Ошибка");
                   }
           }
        else if(read.findInLine("\"(.*)\"([*])([12345678910]*)")!=null){
               String x = read.match().group(1);
               String y = read.match().group(3);               
               String z = read.match().group(2);
               String s = multi(x,y,z);
                if((s.length()<=40)&(x.length()<11)){
                   System.out.println(s);
                }
                else if (s.length()>40){
                   System.out.println(s.substring(0,40)+"...");
                   }
                else {
                   System.out.println("Ошибка");
                   }
           }
        else if(read.findInLine("\"(.*)\"([/])([12345678910]*)")!=null){
               String x = read.match().group(1);
               String y = read.match().group(3);               
               String z = read.match().group(2);
               String s = div(x,y,z);
                if(s.length()<=40){
                   System.out.println(s);
                }
                else if (s.length()>40){
                   System.out.println(s.substring(0,40)+"...");
                   }
                else {
                   System.out.println("Ошибка");
                   }
           }
        else{System.out.println("Ошибка");}
   }
   
   public static String add( String x,String y, String z){
        if (z.equals("+")){
           return x+y;}
        else{
        return "Ошибка";}
   }
   public static String sub(String x,String y, String z){
       if(z.equals("-")){
           String res=x;
                for(int i = 0; i<y.length(); i++){
                String uni = y.substring(i,i+1);
                    if(x.contains(uni)){
                    x=x.replaceFirst(uni, "");
                    res=res.replaceFirst(uni, "");
                    }
                    else{
                    res=x;}
                }
                return res;
           }
           
       
       
       else{   
       return "";}
   }
   public static String multi(String x, String y, String z){
       if(z.equals("*")){
             if(y.equals("1")){
             return x;
             }
             else if(y.equals("2")){
             return x+x;
             }
             else if(y.equals("3")){
             return x+x+x;
             }
             else if(y.equals("4")){
             return x+x+x+x;
             }
             else if(y.equals("5")){
             return x+x+x+x+x;
             }
             else if(y.equals("6")){
             return x+x+x+x+x+x;
             }
             else if(y.equals("7")){
             return x+x+x+x+x+x+x;
             }
             else if(y.equals("8")){
             return x+x+x+x+x+x+x+x;
             }
             else if(y.equals("9")){
             return x+x+x+x+x+x+x+x+x;
             }
             else if(y.equals("10")){
             return x+x+x+x+x+x+x+x+x+x;
             }
             else{return "Ошибка";
             }
             
        }
    return "";}
    public static String div(String x, String y, String z){
        if(z.equals("/")){
        int one = x.length(); 
        int two = Integer.parseInt(y);
            if(one<11&two>0){
            int tree = one/two;
            System.out.println(x.substring(0,tree));
            }
            else{
            return "Ошибка";}
        }
        else {
        System.out.println("Ошибка");
        }
    
        
        
    return"";
    }   
}
