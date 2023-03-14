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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink extends Food {

  private boolean alcohol;
  private boolean soda;

  public Drink(String name, int kcal, boolean soda, boolean alcohol) {
    super(name, kcal); // первая команда в конструкторе потомка - вызов конструктора родителя
    this.alcohol = alcohol;
    this.soda = soda;
  }

  public String openString() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Сколько вам лет?");
    int age = Integer.parseInt(bufferedReader.readLine());

   if (alcohol) {
     if (age >= 18) {
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

