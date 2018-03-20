public class UtilizatorObisnuit extends PersoanaCuCont {

  public ArrayList<Postare> postariObisnuite;

  public UtilizatorObisnuit(ArrayList<Postare> postariObisnuite) {
    this.postariObisnuite = postariObisnuite;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "UtilizatorObisnuit{" +
            "postariObisnuite=" + postariObisnuite +
            '}';
  }

  public ArrayList<Postare> getPostariObisnuite() {
    return postariObisnuite;
  }

  public void setPostariObisnuite(ArrayList<Postare> postariObisnuite) {
    this.postariObisnuite = postariObisnuite;
  }
}