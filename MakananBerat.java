class MakananBerat extends Makanan {
    public MakananBerat(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void cook() {
        System.out.println("Memasak " + getNama());
    }
}
