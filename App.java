import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Makanan Berat:");
        System.out.println("1. Nasi Goreng - Rp 15000");
        System.out.println("2. Ayam Bakar - Rp 20000");
        System.out.println("3. Ayam Goreng - Rp 18000");
        System.out.print("Pilih makanan berat: ");
        int pilihanMenu = input.nextInt();

        Makanan mainCourse;
        switch (pilihanMenu) {
            case 1:
                mainCourse = new MakananBerat("Nasi Goreng", 15000);
                break;
            case 2:
                mainCourse = new MakananBerat("Ayam Bakar", 20000);
                break;
            case 3:
                mainCourse = new MakananBerat("Ayam Goreng", 18000);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Menu Makanan Penutup:");
        System.out.println("1. Pudding - Rp 5000");
        System.out.println("2. Es Krim - Rp 8000");
        System.out.println("3. Salad Buah - Rp 10000");
        System.out.print("Pilih makanan penutup: ");
        int pilihanDessert = input.nextInt();

        Makanan dessert;
        switch (pilihanDessert) {
            case 1:
                dessert = new MakananPenutup("Pudding", 5000, "Mangga");
                break;
            case 2:
                dessert = new MakananPenutup("Es Krim", 8000, "Coklat");
                break;
            case 3:
                dessert = new MakananPenutup("Salad Buah", 10000, "Mix");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Menu Minuman:");
        System.out.println("1. Juice Buah - Rp 10000");
        System.out.println("2. Kopi - Rp 12000");
        System.out.println("3. Teh - Rp 8000");
        System.out.print("Pilih minuman: ");
        int pilihanMinuman = input.nextInt();

        Makanan drink;
        switch (pilihanMinuman) {
            case 1:
                drink = new Minuman("Juice Buah", 10000, "Medium");
                break;
            case 2:
                drink = new Minuman("Kopi", 12000, "Large");
                break;
            case 3:
                drink = new Minuman("Teh", 8000, "Small");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        Order order = new Order();
        order.addFood(mainCourse);
        order.addFood(dessert);
        order.addFood(drink);

        System.out.println("Metode Pembayaran:");
        System.out.println("1. QRIS");
        System.out.println("2. Cash");
        System.out.print("Pilih metode pembayaran: ");
        int pilihanBayar = input.nextInt();

        PaymentMethod paymentMethod;
        switch (pilihanBayar) {
            case 1:
                paymentMethod = new QRIS();
                break;
            case 2:
                paymentMethod = new Cash();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        order.setPaymentMethod(paymentMethod);
        order.hitungTotal();
        input.close();
    }
}
