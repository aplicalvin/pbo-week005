package latihan_b02;

public class Nilai {
    // Atribut
    String nim;          
    String nama;
    double nilaiUts;
    double nilaiTugas;
    double nilaiUas;
    double pNilaiUts;    
    double pNilaiTugas;  
    double pNilaiUas;    
    double nilaiAkhir;

    // Method utk hitung nilai
    void hitungNilai() {
        // Setting point nilai berdasarkan prosentase
        this.pNilaiTugas = this.nilaiTugas * 0.20;  
        this.pNilaiUts = this.nilaiUts * 0.35;      
        this.pNilaiUas = this.nilaiUas * 0.45;      
        this.nilaiAkhir = this.pNilaiUts + this.pNilaiTugas + this.pNilaiUas; 
    }

    // Method utk cetak 
    void cetakNilai() {
        System.out.println("Nilai Tugas : " + this.nilaiTugas + " 20%   : " + this.pNilaiTugas);
        System.out.println("Nilai Uts   : " + this.nilaiUts + " 35%   : " + this.pNilaiUts);
        System.out.println("Nilai Uas   : " + this.nilaiUas + " 45%   : " + this.pNilaiUas);
        System.out.println("Nilai Akhir : " + this.nilaiAkhir);
    }

    // Prosedur utk cetak nilai
    void daftarNilai() {
        System.out.println("NIM: " + this.nim + ", Nama: " + this.nama + ", Nilai Akhir: " + this.nilaiAkhir);
    }
}