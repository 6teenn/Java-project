import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      Restaurant restaurant = new Restaurant();
      
      // добавляєм блюда у меню
      Dish dish1 = new Dish("Steak", "Juicy grilled steak", 25.0, 30);
      Dish dish2 = new Dish("Caesar salad", "Fresh and crisp salad", 12.0, 10);
      Dish dish3 = new Dish("Cheesecake", "Creamy and delicious cheesecake", 8.0, 15);
      Dish dish4 = new Dish("Pasta Carbonara", "Italian pasta with cream sauce and bacon", 15.0, 20);
      Dish dish5 = new Dish("Fish and Chips", "Classic British dish with battered fish and chips", 18.0, 25);
      Dish dish6 = new Dish("Sushi platter", "Assortment of fresh sushi rolls", 30.0, 30);
      Dish dish7 = new Dish("Tomato soup", "Hearty tomato soup with croutons", 10.0, 12);
      Dish dish8 = new Dish("Chicken fajitas", "Mexican-style chicken fajitas with peppers and onions", 20.0, 25);
      Dish dish9 = new Dish("Grilled vegetables", "Assorted grilled vegetables with balsamic glaze", 14.0, 18);
      Dish dish10 = new Dish("Pasta Carbonara", "Spaghetti with creamy sauce, pancetta, and grated cheese", 16.0, 20);


      restaurant.addDish(dish1);
      restaurant.addDish(dish2);
      restaurant.addDish(dish3);
      restaurant.addDish(dish4);
      restaurant.addDish(dish5);
      restaurant.addDish(dish6);
      restaurant.addDish(dish7);
      restaurant.addDish(dish8);
      restaurant.addDish(dish9);
      restaurant.addDish(dish10);

      // виводимо меню у консоль
      restaurant.displayMenu();

      // створюєм заказ
      restaurant.placeOrder();

      // виводимо інформацію про заказ
      System.out.println("Your order: ");
      System.out.println(restaurant.getOrders().get(0));
      System.out.println("Total amount: $" + restaurant.getOrders().get(0).getTotalAmount());

      // розраховуємось за наш заказ
      System.out.println("Enter amount to pay: ");
      double amountPaid = scanner.nextDouble();
      if (amountPaid >= restaurant.getOrders().get(0).getTotalAmount()) {
        restaurant.getOrders().get(0).setPaid(true);
        System.out.println("Payment successful. Thank you for your order!");
      } else {
        System.out.println("Payment failed. Amount paid is less than total amount.");
      }
    }
  }
}