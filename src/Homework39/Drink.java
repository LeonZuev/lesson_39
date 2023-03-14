package Homework39;
/*
  наследник класса Food.
  В классе должны быть дополнительно:
+ поле "газированный" (да/нет)
+ поле "алкогольный" (да/нет)
  метод "открыть", который:
+ для газированного напитка печатает "пшш",
+ для негазированного - "скр",
а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.
 */

public class Drink extends Food {

  private boolean soda;
  private boolean alco;
  private boolean age;

  public Drink(String name, int kcal) {
    super(name, kcal);
  }


  public String openString() {
   if (alco) {
     if (age) {
       return "Ябадабаду!!!";
     }
     else {
       return "До 18-ти пъём только минералку!";
     }
   } else {
       if (soda) {
         return "Пшш";
       } else {
         return "Скр";
       }
     }
   }
  }

