public class HitungLuasDanUntungRugi {

    static float luasSegitiga(float alas, float tinggi) {
        return (alas * tinggi) / 2;
    }

    static float luasPersegiPanjang(float panjang, float lebar) {
        return panjang * lebar;
    }

    static double luasLingkaran(double jari) {
        return 3.14 * Math.pow(jari, 2);
    }

    static void untungRugi(int hargaBeli, int hargaJual) {
        if (hargaBeli == hargaJual) {
            System.out.println("Beli:" + hargaBeli + ", Jual:" + hargaJual + " = Sama Saja");
        } else if (hargaBeli > hargaJual) {
            System.out.println(
                    "Beli:" + hargaBeli + ", Jual:" + hargaJual + " = Rugi Sebesar : " + (hargaJual - hargaBeli));
        } else {
            System.out.println(
                    "Beli:" + hargaBeli + ", Jual:" + hargaJual + " = Untung Sebesar : " + (hargaJual - hargaBeli));
        }
    }

    public static void main(String[] args) {
        System.out.println("Alas:20,Tinggi:25, Luas Segitiga = " + luasSegitiga(20, 25));
        System.out.println("Panjang:40,Lebar:6, Luas Persegi Panjang = " + luasPersegiPanjang(40, 6));
        System.out.println("Jari2:7, Luas Lingkaran =  " + luasLingkaran(7));
        untungRugi(15000, 30000);
        untungRugi(12000, 9000);
        untungRugi(12000, 12000);
    }
}
