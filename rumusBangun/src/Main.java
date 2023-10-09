class persegi{
    int sisi;

    void luas(int sisi){
        float luas = (float) (sisi * sisi);
        System.out.println("Luas Persegi = " + luas);
    }

    void keliling(int sisi){
        float keliling = (float) (4 * sisi);
        System.out.println("Keliling Persegi : " + keliling);
    }
}

class kubus{
    int sisi;

    void volume(int sisi){
        float volume = (float) (sisi * sisi *sisi);
        System.out.println("Volume Kubus : " + volume);
    }

    void luasPermukaan(int sisi){
        float luasPermukaan = (float) (6 * (sisi*sisi) );
        System.out.println("Luas Permukaan Kubus " + luasPermukaan);
    }
}

class persegiPanjang{
    int panjang;
    int lebar;

    void luas(int panjang, int lebar){
        float luas = (float) (panjang * lebar);
        System.out.println("Luas Persegi : " + luas);
    }

    void keliling(int panjang, int lebar){
        float keliling = (float) (2 * (panjang * lebar) );
        System.out.println("Keliling Persegi : " + keliling);
    }
}

class balok{
    int panjang;
    int lebar;
    int tinggi;

    void volume(int panjang, int lebar, int tinggi){
        float volume = (float) (panjang * lebar * tinggi);
        System.out.println("Luas Balok : " + volume);
    }

    void luasPermukaan(int panjang, int lebar, int tinggi){
        float luasPermukaan = (float) ( 2 * (panjang*lebar) + (lebar*tinggi) + (panjang*tinggi) );
        System.out.println("Luas Permukaan Balok : " + luasPermukaan);
    }
}

class segitiga{
    int alas;
    int tinggi;

    void luas(int alas, int tinggi){
        float luas = (float) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga : " + luas);
    }
}

class lingkaran{
    double phi=3.14;
    int jari;

    void luas(int jari){
        float luas = (float) (phi * jari * jari);
        System.out.println("Luas Lingkaran : " + luas);
    }

    void keliling(int jari){
        float keliling = (float) (2 * phi * jari);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}

class tabung{
    double phi = 3.14;
    int jari;
    int tinggi;

    void volume(int jari, int tinggi){
        float volume = (float) (phi * jari * jari * tinggi);
        System.out.println("Volume Tabung : "+ volume);
    }
}

class bola{
    double phi = 3.14;
    int jari;

    void volume(int jari){
        float volume = (float) ( (4/3) * phi * jari * jari);
        System.out.println("Volume Bola : " + volume);
    }

    void luasPermukaan(int jari){
        float luasPermukaan = (float) (4 * phi * jari * jari);
        System.out.println("Luas Permukaan : " + luasPermukaan);
    }
}

class jajargenjang{
    int alas;
    int tinggi;

    void luas(int alas, int tinggi){
        float luas = (float) (alas * tinggi);
        System.out.println("Luas Jajargenjang : " + luas);
    }
}

class kerucut{
    double phi = 3.14;
    int jari;
    int tinggi;

    void volume(int jari, int tinggi){
        float volume = (float) ( (1/3) * phi * jari * jari * tinggi);
        System.out.println("Volume Kerucut : " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        balok balok1 = new balok();
        balok1.panjang = 10;
        balok1.lebar = 10;
        balok1.tinggi = 10;
        balok1.volume(balok1.panjang, balok1.lebar, balok1.tinggi);
        balok1.luasPermukaan(balok1.panjang, balok1.lebar, balok1.tinggi);

        bola bola1 = new bola();
        bola1.jari = 5;
        bola1.volume(bola1.jari);
        bola1.luasPermukaan(bola1.jari);

        jajargenjang jajarGenjang1 = new jajargenjang();
        jajarGenjang1.alas = 6;
        jajarGenjang1.tinggi = 8;
        jajarGenjang1.luas(jajarGenjang1.alas, jajarGenjang1.tinggi);

        kerucut kerucut1 = new kerucut();
        kerucut1.jari = 10;
        kerucut1.tinggi = 120;
        kerucut1.volume(kerucut1.jari, kerucut1.tinggi);

        kubus kubus1 = new kubus();
        kubus1.sisi = 7;
        kubus1.volume(kubus1.sisi);
        kubus1.luasPermukaan(kubus1.sisi);

        lingkaran lingkaran1 = new lingkaran();
        lingkaran1.jari = 4;
        lingkaran1.luas(lingkaran1.jari);
        lingkaran1.keliling(lingkaran1.jari);

        persegi persegi1 = new persegi();
        persegi1.sisi = 6;
        persegi1.luas(persegi1.sisi);
        persegi1.keliling(persegi1.sisi);

        persegiPanjang persegiPanjang1 = new persegiPanjang();
        persegiPanjang1.panjang = 5;
        persegiPanjang1.lebar = 9;
        persegiPanjang1.luas(persegiPanjang1.panjang, persegiPanjang1.lebar);
        persegiPanjang1.keliling(persegiPanjang1.panjang, persegiPanjang1.lebar);

        segitiga segitiga1 = new segitiga();
        segitiga1.alas = 8;
        segitiga1.tinggi = 6;
        segitiga1.luas(segitiga1.alas, segitiga1.tinggi);

        tabung tabung1 = new tabung();
        tabung1.jari = 4;
        tabung1.tinggi = 10;
        tabung1.volume(tabung1.jari, tabung1.tinggi);
    }
}
