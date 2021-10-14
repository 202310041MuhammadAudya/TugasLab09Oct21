class BangunDatar{
    public void luas(){
        System.out.println("Menghitung Luas Bangun Datar");
        
    }

    public void keliling(){
        System.out.println("Menghitung Keliling Bangun Datar");
        
    }
}

class Persegi extends BangunDatar{
    int sisi = 4;
    int Luas = sisi * sisi;
    int keliling = 4 * sisi;

    public void jenis(){
        System.out.println("Menghitung Luas dan Keliling Persegi ");
    }
}


class PersgeiPanjang extends BangunDatar{
    int panjang = 6;
    int lebar = 7;
    
    int luas = panjang * lebar;
    int keliling = 2 * panjang + 2 * lebar;

    public void jenis(){
        System.out.println("Menghitung Luas dan Keliling Persegi Panjang");;
    }
}

class SegitigaSikuSiku extends BangunDatar{
    float alas = 4;
    float tinggi = 8;
    float sisimiring = 6;



    double luas = 0.5 * alas * tinggi;
    float keliling = alas + tinggi + sisimiring;

    public void jenis(){
        System.out.println("Menghitung Luas dan Keliling Segitiga Siku-Siku");
    }
}

public class TugasLab {
    public static void main(String[] args) {
        
        BangunDatar bd = new BangunDatar();
        System.out.println("Class Bangun Datar - Main Class");
        bd.luas();
        bd.keliling();
        System.out.println("===============================");
        System.out.println("Class Persegi - Sub Class");
        Persegi p = new Persegi();
        p.jenis();
        System.out.println("Luas Persegi : " +p.Luas);
        System.out.println("Keliling Persegi : " +p.keliling);
        System.out.println("===============================");
        PersgeiPanjang pp = new PersgeiPanjang();
        p.jenis();
        System.out.println("Luas Persegi Panjang : " +pp.luas);
        System.out.println("Keliling Persegi Panjang : " +pp.keliling);
        System.out.println("===============================");
        SegitigaSikuSiku sss = new SegitigaSikuSiku();
        sss.jenis();
        System.out.println("Luas Segitiga Siku-Siku : " +sss.luas);
        System.out.println("Keliling Segitiga Siku-Siku : " +sss.keliling);


        //Enkapsulasi
        System.out.println("===============================");
        System.out.println("Class Enkapsulasi");
        Enkapsulasi e = new Enkapsulasi();
        e.setLPersegi(16);
        e.setKPersegi(16);
        e.setLPersegiPanjang(42);
        e.setKPersegiPanjang(26);
        e.setLSegitigaSikuSiku(16.0);
        e.setKSegitigaSikuSiku(18.0);
        
        System.out.println((e.getKPersegi()));
        System.out.println((e.getLPersegi()));
        System.out.println((e.getKPersegiPanjang()));
        System.out.println((e.getLPersegiPanjang()));
        System.out.println((e.getKSegitigaSikuSiku()));
        System.out.println((e.getLSegitigaSikuSiku()));
    }
}