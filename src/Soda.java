public class Soda {
  private String add;
  public Soda(String add) {
    this.add = add;
  }
  public String GetMyDrinkString() {
    if (add != null && !add.isEmpty() ) {
      return("Газировка и " + add);
    } else {
      return("Обычная газировка");
    }
  }
}
