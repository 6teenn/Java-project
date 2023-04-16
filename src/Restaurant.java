import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Конструктор для ініціалізації меню та списку замовлень
public class Restaurant {
  private List<Dish> menu;
  private List<Order> orders;

  public Restaurant() {
    menu = new ArrayList<>();
    orders = new ArrayList<>();
  }

  // додає страви до списку меню
  public void addDish(Dish dish) {
    menu.add(dish);
    System.out.println("Dish added successfully");
  }

  // відображає меню
  public void displayMenu() {
    for (int i = 0; i < menu.size(); i++) {
      System.out.println((i + 1) + ". " + menu.get(i));
    }
  }

  // Метод який розміщує замовлення
  public void placeOrder() {
    try (Scanner scanner = new Scanner(System.in)) {
      Order order = new Order();

      // Цикл додавання страв до замовлення
      while (true) {
        displayMenu();
        System.out.println("Enter the number of the dish you want to order: ");
        int dishNumber = scanner.nextInt();
        System.out.println("Enter the quantity: ");
        int quantity = scanner.nextInt();

        order.addDish(menu.get(dishNumber - 1), quantity);

        System.out.println("Do you want to add more dishes to your order? (Y/N)");
        scanner.nextLine();
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("N")) {
          break;
        }
      }

      orders.add(order);
    }
    System.out.println("Order placed successfully");
  }

  // Повертає список замовлень
  public List<Order> getOrders() {
    return orders;
  }
}