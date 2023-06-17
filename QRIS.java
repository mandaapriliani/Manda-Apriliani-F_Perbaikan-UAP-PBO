class QRIS implements PaymentMethod {
    private static final double DISCOUNT_RATE = 0.2;
    private static final double TAX_RATE = 0.1;

    @Override
    public void pay(double amount) {
        double discount = amount * DISCOUNT_RATE;
        double tax = amount * TAX_RATE;
        double total = amount - discount + tax;
        System.out.println("=================================");
        System.out.println("Pembayaran dengan metode QRIS.");
        System.out.println("Total: " + amount);
        System.out.println("Diskon: " + discount);
        System.out.println("Pajak: " + tax);
        System.out.println("Total Pembayaran: " + total);
        System.out.println("==================================");
    }
}
