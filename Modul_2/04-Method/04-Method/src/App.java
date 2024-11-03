class Mahasiswa {
    // data member atau atribut
    String nama;
    String nim;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;

    }

    // method tanpa parameter dan return
    void cetak() {
        // mencetak nama dan nim
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
    }

    // method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.nim;
    }

    // method dengan parameter dan return
    String sayHI(String nama) {
        this.nama = nama;
        return "Selamat Datang di Siakad " + this.nama;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // instansi atau menciptakan objek
        Mahasiswa mhs_1 = new Mahasiswa("Supri", "23241020");

        // memanggil method cetak()
        mhs_1.cetak();

        // memanggil metod setNama()
        mhs_1.setNama("Kipli");
        // cetak setelah ubah nama
        mhs_1.cetak();

        // memanggil method getNama dan getNIM
        String nama_mhs = mhs_1.getNama();
        String nim_mhs = mhs_1.getNIM();
        System.out.println("Nama : " + nama_mhs);
        System.out.println("NIM : " + nim_mhs);

        // memanggil method sayHI()
        String pesan = mhs_1.sayHI(mhs_1.nama);
        System.out.println(pesan);

    }
}