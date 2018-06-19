/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoquines;

import adoquines.lista.Lista;

/**
 *
 * @author Eliam
 */
public class AdoquinVariado {
    
    
    public double  buscarCaminos(int n, int m){
        if(n<=1)return 1;
        double i=0,cant=0;
        do{
            cant+=buscarCaminos(--n,m);
            i++;
        }while(i<m&&n!=0);
        return cant;
    }
    
     public void imprimirCaminos(int n,int m, Lista l){
        if(n==0){
            l.imprimirLista();  
        }else{
            int i=0;
            do{
                l.insert(i+1);
                imprimirCaminos(--n,m,l);
                i++;
            }while(i<m&&n!=0); 
        }
        l.eliminarCola();
    }
}

