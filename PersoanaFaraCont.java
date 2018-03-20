public class PersoanaFaraCont extends Persoana {

  public ArrayList<Postare> postarePublica;

  public PersoanaFaraCont(ArrayList<Postare> postarePublica) {
    this.postarePublica = postarePublica;
  }

  public ArrayList<Postare> getPostarePublica() {
    return postarePublica;
  }

  public void setPostarePublica(ArrayList<Postare> postarePublica) {
    this.postarePublica = postarePublica;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "PersoanaFaraCont{" +
            "postarePublica=" + postarePublica +
            '}';
  }
}