/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan43.gajipegawai;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : Program untuk menghitung gaji pegawai
 */
public class PBO2_10118069_Latihan43_GajiPegawai {
    private static int totalgaji;
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm No72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        
        totalgaji = gp.totalGaji(gp.getUangTransport(), gp.getUangTunjangan(), gp.getGajiPokok());
        
        gp.tampilData(gp.getNama(), gp.getAlamat(), gp.getUangTransport(), gp.getUangTunjangan(), gp.getGajiPokok(),totalgaji);
        
    }
}
