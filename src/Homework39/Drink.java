package Homework39;
/*
  наследник класса Food.
  В классе должны быть дополнительно:
+ поле "газированный" (да/нет)
+ поле "алкогольный" (да/нет)
метод "открыть", который:
для газированного напитка печатает "пшш",
для негазированного - "скр",
а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.
 */

public class Drink extends Food {

  private boolean soda;
  private boolean alco;

  public String openString() {
    if (soda = true) {
      return "Пшш";
    }
    else {
      return "скр";
    }
    if (alco = true) {
      System.out.println("Исполнилось 18?");
      private boolean age;
      if (age = true) {
        return "Ябадабадуу!!!";
      }
      else {
        return "до 18-ти пъём только минералку!!!";
      }
    }
  }
}

