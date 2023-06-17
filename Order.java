import java.util.ArrayList;

class Order {
    private ArrayList<Makanan> foods;
    private double totalAmount;
    private PaymentMethod paymentMethod;

    public Order() {
        foods = new ArrayList<>();
        totalAmount = 0;
    }

    public void addFood(Makanan food) {
        foods.add(food);
        totalAmount += food.getHarga();
    }

    public void removeFood(Makanan food) {
        foods.remove(food);
        totalAmount -= food.getHarga();
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void hitungTotal() {
        if (paymentMethod != null) {
            paymentMethod.pay(totalAmount);
        }
    }
}
