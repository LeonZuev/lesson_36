public class Soda {
  /*
  У класса должен быть конструктор, принимающий 1 аргумент при ??инициализации?? -   !!!
  строку добавка (например, "малина"), отвечающий за добавку к выбираемому лимонаду. +
  В этом классе реализуйте метод public String GetMyDrinkString(),
  возвращающий строку Газировка и {добавка} в случае наличия добавки.
  Если добавки нет, нужно вернуть строку "Обычная газировка".
   */
  private String additive;
  public Soda() {
    additive = "малина";
  }
  public String GetMyDrinkString() {
    if (additive != null ) {
      System.out.println("Газировка" + additive);
    } else {
      System.out.println("Обычная газировка");
    }
    return null;
  }
}
