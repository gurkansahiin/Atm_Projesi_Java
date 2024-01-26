/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;



 //verileri tanımlamış oluyoruz
public class DbVeriMerkezi extends DbConnection{
    //kalıtımdan kalıtım yapacağız onun için protected
    protected int kullanici_id=0;
    protected String telNo,adSoyad,tcNo,musteriNo;
    protected double bakiye;
    protected double elektrik_faturasi,su_faturasi,dogalgaz_faturasi;
    protected double internet_faturasi;
    protected String tarih;
    protected String tur;
    protected double borc;
    protected boolean borc_durum;

    public int getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public double getBakiye() {
        return Math.round(bakiye * 100.0) / 100.0;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public double getElektrik_faturasi() {
        return elektrik_faturasi;
    }

    public void setElektrik_faturasi(double elektrik_faturasi) {
        this.elektrik_faturasi = elektrik_faturasi;
    }

    public double getSu_faturasi() {
        return su_faturasi;
    }

    public void setSu_faturasi(double su_faturasi) {
        this.su_faturasi = su_faturasi;
    }

    public double getInyernet_faturasi() {
        return internet_faturasi;
    }

    public void setInyernet_faturasi(double inyernet_faturasi) {
        this.internet_faturasi = inyernet_faturasi;
    }

    public double getDogalgaz_faturasi() {
        return dogalgaz_faturasi;
    }

    public void setDogalgaz_faturasi(double dogalgaz_faturasi) {
        this.dogalgaz_faturasi = dogalgaz_faturasi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getKredi_Tur() {
        return tur;
    }

    public void setKredi_Tur(String Kredi_Tur) {
        this.tur = Kredi_Tur;
    }

    public double getBorc() {
        return borc;
    }

    public void setBorc(double borc) {
        this.borc = borc;
    }

    public boolean isBorc_durum() {
        return borc_durum;
    }

    public void setBorc_durum(boolean borc_durum) {
        this.borc_durum = borc_durum;
    }
    
    
    
    
    
}