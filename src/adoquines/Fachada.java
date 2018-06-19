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
public class Fachada {
    
    AdoquinVariado adoquin;

    public Fachada() {
        adoquin=new AdoquinVariado();
    }
    
    public int generarPocisiones(int n){
        int lim=(n<9)?(n-1):8;
        return 2 + (int)(Math.random() * lim);
    }
    
    public int  buscarCaminos(int n, int m){
        adoquin.cant=0;
        adoquin.buscarCaminos(n, m);
        return adoquin.cant;
    }
    
    public void imprimirCaminos(int n,int m){
        adoquin.imprimirCaminos(n, m, new Lista());
    }
    
    
}
