/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uh1_atm;

import javax.swing.JOptionPane;

/**
 *
 * @author Arischa Nur Fadilah
 */
public class tarikclass {
    private int saldo;
    public void ambil (int tab, int t){
        if(t%100!=0){
            JOptionPane.showMessageDialog(null,"Mesin BRI tidak menerima uang koin", "Transaksi gagal", 0); 
        }
        else if (t<50000) {
            JOptionPane.showMessageDialog(null, "Besaran Minimal Pengambilan tunai adalah Rp. 50000","ERROR",0);
        } else if(t>tab){
            
            JOptionPane.showMessageDialog(null, "Saldo Anda tidak mencukupi, silahkan ulangi lagi ", "Transaksi gagal",0);
        } else if(t<tab){
            saldo = tab - t;
            JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : " + saldo);
        }
    }
    public int getSaldo(){
        return saldo;
    }
}
