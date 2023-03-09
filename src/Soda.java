public class Soda {
  private String supplement;
  public Soda(String supplement) {
    this.supplement = supplement;
  }
  public String GetMyDrinkString() {
    if (supplement != null && !supplement.isEmpty() ) {
      return("Газировка и " + supplement);
    } else {
      return("Обычная газировка");
    }
  }
}
