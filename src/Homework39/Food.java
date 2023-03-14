package Homework39;

/*

+ поле "название"
+ поле "калорийность"
+ конструктор, геттеры, сеттеры
метод "употребить еду" с каким-нибудь выводом
 */
public class Food {

  private String name;
  private String kcal;

  public Food(String name, String kcal) {
    this.name = name;
    this.kcal = kcal;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setKcal(String kcal) {
    this.kcal = kcal;
  }

  public String getName() {
    return name;
  }
  public  String getKcal() {
    return kcal;
  }

  public String eatFoodString() {
    String result = String.format("%s содержит %s колорий", name, kcal.toString());
    return result;
  }

}
