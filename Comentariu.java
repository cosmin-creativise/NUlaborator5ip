public class Comentariu {

  public String text;

  public Comentariu(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Comentariu{" +
            "text='" + text + '\'' +
            '}';
  }
}