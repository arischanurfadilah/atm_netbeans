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
public class setorclass {
    private int saldo;
    public void menabung(int bal, int s){
        if(s%100!=0){
            JOptionPane.showMessageDialog(null, "Mesin ini tidak menerima uang koin","Transaksi gagal",0);
        } else if (s<50000) {
            JOptionPane.showMessageDialog(null, "Besaran Minimal Setor adalah Rp. 50000","ERROR",0);
        } else if(s>=50000){
            saldo = bal + s;
            JOptionPane.showMessageDialog(null, "Saldo Anda sebesar : " + saldo);
        }
    }
    public int getSaldo(){
        return saldo;
    }
}
