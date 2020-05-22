/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author acer
 */
public class PruevaCola {
    public static void main(String args[]){
        int num=0;
        ColaNumEntero cl=new ColaNumEntero(3);
        try{
         cl.encolar(1);
        num=cl.sacar();
        System.out.println(num);
        num=cl.sacar();
        System.out.println(num);
         
        }catch( ExcepcionColaLLena err){
            System.out.println(err.getMessage()); 
        }catch(ExcepcionColaVacia err){
            System.out.println(err.getMessage());
        }
    }
}
