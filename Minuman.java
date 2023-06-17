class Minuman extends Makanan{
    private String size;

    public Minuman(String nama, int harga, String size) {
        super(nama, harga);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void cook() {
        System.out.println("Membuat " + getNama() + " ukuran " + getSize() + ".");
    }
}
