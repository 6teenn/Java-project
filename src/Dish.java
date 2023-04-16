public class Dish {
  private String name;
  private String description;
  private double price;
  private int preparationTime;

  public Dish(String name, String description, double price, int preparationTime) {
      this.name = name;
      this.description = description;
      this.price = price;
      this.preparationTime = preparationTime;
  }

  public String getName() {
      return name;
  }

  public String getDescription() {
      return description;
  }

  public double getPrice() {
      return price;
  }

  public int getPreparationTime() {
      return preparationTime;
  }

  @Override
  public String toString() {
      return "Dish: " +
              "name=' " + name + '\'' +
              ", description=' " + description + '\'' +
              ", price= " + price +
              ", preparationTime= " + preparationTime +
              '}';
  }
}
