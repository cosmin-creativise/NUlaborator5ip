public class FotografProfesionist extends PersoanaCuCont {

  public ArrayList<Postare> postariPremium;

  public ArrayList<Postare> getPostariPremium() {
    return postariPremium;
  }

  public void setPostariPremium(ArrayList<Postare> postariPremium) {
    this.postariPremium = postariPremium;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "FotografProfesionist{" +
            "postariPremium=" + postariPremium +
            '}';
  }
}