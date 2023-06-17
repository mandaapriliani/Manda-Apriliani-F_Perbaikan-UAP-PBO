class Cash implements PaymentMethod {
    private static final double TAX_RATE = 0.1;

    @Override
    public void pay(double amount) {
        double tax = amount * TAX_RATE;
        double total = amount + tax;
        System.out.println("=================================");
        System.out.println("Pembayaran dengan metode tunai (cash).");
        System.out.println("Total: " + amount);
        System.out.println("Pajak: " + tax);
        System.out.println("Total Pembayaran: " + total);
        System.out.println("=================================");
    }
}
