public class Postare {

  public Media media;

  public ArrayList<Comentariu> comentarii;

  public ArrayList<PersoaneCuCont> persoaneCareApreciaza;

  public Postare(Media media, ArrayList<Comentariu> comentarii, ArrayList<PersoaneCuCont> persoaneCareApreciaza) {
    this.media = media;
    this.comentarii = comentarii;
    this.persoaneCareApreciaza = persoaneCareApreciaza;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Postare{" +
            "media=" + media +
            ", comentarii=" + comentarii +
            ", persoaneCareApreciaza=" + persoaneCareApreciaza +
            '}';
  }

  public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }

  public ArrayList<Comentariu> getComentarii() {
    return comentarii;
  }

  public void setComentarii(ArrayList<Comentariu> comentarii) {
    this.comentarii = comentarii;
  }

  public ArrayList<PersoaneCuCont> getPersoaneCareApreciaza() {
    return persoaneCareApreciaza;
  }

  public void setPersoaneCareApreciaza(ArrayList<PersoaneCuCont> persoaneCareApreciaza) {
    this.persoaneCareApreciaza = persoaneCareApreciaza;
  }
}