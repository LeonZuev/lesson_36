public class Main {
 /*
  Создайте класс Soda (для определения типа газированной воды).
  У класса должен быть конструктор, принимающий 1 аргумент при инициализации -
  строку добавка (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
  В этом классе реализуйте метод public String GetMyDrinkString(),
  возвращающий строку Газировка и {добавка} в случае наличия добавки.
  Если добавки нет, нужно вернуть строку "Обычная газировка".
  */
  public static void main(String[] args) {
    Soda mySoda = new Soda("малина");
    String drinkString = mySoda.GetMyDrinkString();
    System.out.println(drinkString);
  }
}