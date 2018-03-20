public class Imagine extends Media {

  public Integer dimensiune;

  public Imagine(Integer dimensiune) {
    this.dimensiune = dimensiune;
  }

  public Integer getDimensiune() {
    return dimensiune;
  }

  public void setDimensiune(Integer dimensiune) {
    this.dimensiune = dimensiune;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Imagine{" +
            "dimensiune=" + dimensiune +
            '}';
  }
}