package Mingguke3;

public class Pojo {
    private String nip;
    private String nama;
    private String divisi;

    public Pojo (String nip, String nama, String divisi){
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }
    @Override
    public String toString(){
        return "\nNIP = " + nip +
                "\nNama = " + nama  +
                "\nKelas = " + divisi;

    }
}
