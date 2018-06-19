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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdoquinVariado adoquin=new AdoquinVariado();
        int n,m;
        n=8;
        m= 4;
        System.out.println("n="+n+", m="+m+" Cantidad caminos="+adoquin.buscarCaminos(n, m));
        adoquin.imprimirCaminos(n, m, new Lista());
    }
    
}
