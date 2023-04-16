import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private List<Dish> dishes;
    private List<Integer> quantities;
    private Date orderTime;
    private double totalAmount;
    private boolean isPaid;

    public Order() {
        dishes = new ArrayList<>();
        quantities = new ArrayList<>();
        orderTime = new Date();
        totalAmount = 0.0;
        isPaid = false;
    }
    // добавляє блюдо та їх кількість до списку та обновляє сумму заказу
    public void addDish(Dish dish, int quantity) {
        dishes.add(dish);
        quantities.add(quantity);
        totalAmount += dish.getPrice() * quantity;
    }

    // повертає час заказу
    public Date getOrderTime() {
        return orderTime;
    }


    // поветає сумму заказу
    public double getTotalAmount() {
        return totalAmount;
    }

    // повератая isPaid якщо оплата успішна
    public boolean isPaid() {
        return isPaid;
    }

    // встановлює isPaid 
    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order{" +
                "orderTime=" + orderTime +
                ", totalAmount=" + totalAmount +
                ", isPaid=" + isPaid +
                '}' + "\n");
        for (int i = 0; i < dishes.size(); i++) {
            sb.append(dishes.get(i).getName() + " x " + quantities.get(i) + "\n");
        }
        return sb.toString();
    }
}