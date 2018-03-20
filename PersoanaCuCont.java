public class PersoanaCuCont extends Persoana {

  public String numeUtilizator;

  public ArrayList<PersoanaCuCont> urmaritori;

  public ArrayList<PersoanaCuCont> persoanaUrmarite;

  public ArrayList<Media> medii;

  public PersoanaCuCont(String numeUtilizator, ArrayList<PersoanaCuCont> urmaritori, ArrayList<PersoanaCuCont> persoanaUrmarite, ArrayList<Media> medii) {
    this.numeUtilizator = numeUtilizator;
    this.urmaritori = urmaritori;
    this.persoanaUrmarite = persoanaUrmarite;
    this.medii = medii;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "PersoanaCuCont{" +
            "numeUtilizator='" + numeUtilizator + '\'' +
            ", urmaritori=" + urmaritori +
            ", persoanaUrmarite=" + persoanaUrmarite +
            ", medii=" + medii +
            '}';
  }

  public String getNumeUtilizator() {
    return numeUtilizator;
  }

  public void setNumeUtilizator(String numeUtilizator) {
    this.numeUtilizator = numeUtilizator;
  }

  public ArrayList<PersoanaCuCont> getUrmaritori() {
    return urmaritori;
  }

  public void setUrmaritori(ArrayList<PersoanaCuCont> urmaritori) {
    this.urmaritori = urmaritori;
  }

  public ArrayList<PersoanaCuCont> getPersoanaUrmarite() {
    return persoanaUrmarite;
  }

  public void setPersoanaUrmarite(ArrayList<PersoanaCuCont> persoanaUrmarite) {
    this.persoanaUrmarite = persoanaUrmarite;
  }

  public ArrayList<Media> getMedii() {
    return medii;
  }

  public void setMedii(ArrayList<Media> medii) {
    this.medii = medii;
  }
}