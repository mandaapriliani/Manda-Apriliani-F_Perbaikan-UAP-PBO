class MakananPenutup extends Makanan {
    private String rasa;

    public MakananPenutup(String nama, int harga, String rasa) {
        super(nama, harga);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    @Override
    public void cook() {
        System.out.println("Membuat " + getNama() + " dengan rasa " + getRasa() + ".");
    }
}
