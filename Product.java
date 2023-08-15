public class Product {

    private String nama, deskripsi;
    private int harga, stok;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = "this is " + deskripsi;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void getInfo() {
        System.out.println("====");
        System.out.println("INFO PRODUCT");
        System.out.println("nama : " + this.nama);
        System.out.println("deskripsi : " + this.deskripsi);
        System.out.println("harga : " + this.harga);
        System.out.println("stok : " + this.stok);
        System.out.println("====");
    }

    public static void main(String[] args) {
        Product coffee = new Product();
        Product milk = new Product();
        Product appleJuice = new Product();

        coffee.setNama("Coffee");
        coffee.setDeskripsi("Coffee");
        coffee.setHarga(15000);
        coffee.setStok(10);

        milk.setNama("Milk");
        milk.setDeskripsi("Milk");
        milk.setHarga(25000);
        milk.setStok(10);

        appleJuice.setNama("Apple Juice");
        appleJuice.setDeskripsi("Apple Juice");
        appleJuice.setHarga(18000);
        appleJuice.setStok(20);

        coffee.getInfo();
        milk.getInfo();
        appleJuice.getInfo();
    }
}
