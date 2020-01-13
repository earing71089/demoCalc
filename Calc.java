/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

/**
 *
 * @author Earring
 */
public class Calc {
    
    public double addition (int x , int y){
        if(x>0&x<11){
        return x+y; //возвращает результат сложения перменной х и у    
        }
        else if(y>0&y<11){
        return x+y; //возвращает результат сложения перменной х и у    
        }
        return 0;
        
    }
    public double substraction (int x, int y) {
        if(x>0&x<11){
        return x-y; //возвращает результат сложения перменной х и у    
        }
        else if(y>0&y<11){
        return x-y; //возвращает результат сложения перменной х и у    
        }
        return 0;
    }
    public  double division (double x, int y){
       if(x>0&x<11){
        return x/y; //возвращает результат сложения перменной х и у    
        }
        else if(y>0&y<11){
        return x/y; //возвращает результат сложения перменной х и у    
        }
        return 0;
    }
    public double multiplication (int x, int y)
    {
        if(x>0&x<11){
        return x*y; //возвращает результат сложения перменной х и у    
        }
        else if(y>0&y<11){
        return x*y; //возвращает результат сложения перменной х и у    
        }
        return 0;
    }
    public double action (int x , int y , String operator){ // передает переменные х, у и знак
        switch (operator) { //принимает знак + - / *
            case "+":
                return  this.addition(x, y); //выполнить сложение
            case "-":
                return  this.substraction(x, y); //выполнить вычитания
            case "/":
                return this.division(x, y); //выполнить деление
            case "*":
                return this.multiplication(x, y);//выполнить умножение
 
 
            default: //если ни одно из значений не выполняется, выполнить 0
                return 0;
 
        }
 
    }
}
    
