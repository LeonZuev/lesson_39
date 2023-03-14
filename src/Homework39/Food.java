package Homework39;

/*

+ поле "название"
+ поле "калорийность"
+ конструктор, геттеры, сеттеры
+ метод "употребить еду" с каким-нибудь выводом
 */
public class Food {

  private String name;
  private int kcal;

  public Food(String name, int kcal) {
    this.name = name;
    this.kcal = kcal;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setKcal(int kcal) {
    this.kcal = kcal;
  }

  public String getName() {
    return name;
  }
  public  int getKcal() {
    return kcal;
  }

  public String eatFoodString() {
    return String.format("%s содержит %d колорий", name, kcal);
  }

}
