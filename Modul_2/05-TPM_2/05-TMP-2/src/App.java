class Mahasiswa {
    // Data member atau atribut
    String nama;
    String nim;
    String prodi; 
    String semester; 
    String kampus; 
    String undikma; 

    // Konstruktor
    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = "PTI"; 
        this.semester = "3"; 
        this.kampus = "Universitas undikma"; 
        this.undikma = "Universitas Pendidikan"; 
    }

    // Method tanpa parameter dan return untuk mencetak informasi mahasiswa
    void cetak() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Prodi: " + this.prodi);
        System.out.println("Semester: " + this.semester);
        System.out.println("Kampus: " + this.kampus);
        System.out.println("Undikma: " + this.undikma);
    }

    // Method tanpa return dengan parameter untuk mengubah nama
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method tanpa return dengan parameter untuk mengubah NIM
    void setNIM(String nim) {
        this.nim = nim;
    }

    // Method dengan return tanpa parameter untuk mendapatkan nama
    String getNama() {
        return this.nama; // Perbaiki untuk mendapatkan nama
    }

    // Method dengan return tanpa parameter untuk mendapatkan NIM
    String getNIM() {
        return this.nim; // Perbaiki untuk mendapatkan NIM
    }

    // Method tanpa parameter dan return untuk menyapa mahasiswa
    String sayHI() {
        return "Selamat Datang di Siakad " + this.nama;
    }

    // Method tanpa parameter dan return untuk menampilkan informasi lengkap
    String infoLengkap() {
        return "Informasi Mahasiswa:\nNama: " + this.nama + "\nNIM: " + this.nim;
    }
}

public class App {
    public static void main(String[] args) {
        // Instansi atau menciptakan objek
        Mahasiswa mhs_1 = new Mahasiswa("Supri", "23241020");

        // Memanggil method cetak()
        mhs_1.cetak();

        // Memanggil metod setNama()
        mhs_1.setNama("Kipli");
        // Cetak setelah ubah nama
        mhs_1.cetak();

        // Memanggil metod setNIM()
        mhs_1.setNIM("23241016");
        // Cetak setelah ubah NIM
        mhs_1.cetak();

        // Memanggil method getNama dan getNIM
        String nama_mhs = mhs_1.getNama(); // Perbaiki untuk memanggil getNama
        String nim_mhs = mhs_1.getNIM(); // Perbaiki untuk memanggil getNIM
        System.out.println("Nama: " + nama_mhs);
        System.out.println("NIM: " + nim_mhs);

        // Memanggil method sayHI()
        String pesan = mhs_1.sayHI();
        System.out.println(pesan);

        // Memanggil method infoLengkap()
        String info = mhs_1.infoLengkap();
        System.out.println(info);
    }
}