/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt2recursividad_2;

/**
 *
 * @author nathalyarias
 */
public class T2RecursividadClass2 {
     public static int suma_vec (int v[], int n){
       
            if (n == 0) {
            return v [n];
        }else {
            return suma_vec(v, n - 1) + v [n];
        }
        } 
    }
    

