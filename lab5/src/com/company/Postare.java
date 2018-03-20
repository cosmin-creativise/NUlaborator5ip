package com.company;
import java.util.ArrayList;

public class Postare {

  public Media media;

  public ArrayList<Comentariu> comentarii;

  public ArrayList<PersoanaCuCont> persoaneCareApreciaza;

  public Postare(Media media, ArrayList<Comentariu> comentarii, ArrayList<PersoanaCuCont> persoaneCareApreciaza) {
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

  public ArrayList<PersoanaCuCont> getPersoaneCareApreciaza() {
    return persoaneCareApreciaza;
  }

  public void setPersoaneCareApreciaza(ArrayList<PersoanaCuCont> persoaneCareApreciaza) {
    this.persoaneCareApreciaza = persoaneCareApreciaza;
  }
}