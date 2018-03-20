package com.company;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;

public class FotografProfesionist extends PersoanaCuCont {

  public ArrayList<Postare> postariPremium;

  public ArrayList<Postare> getPostariPremium() {
    return postariPremium;
  }

  public FotografProfesionist(String numeUtilizator, ArrayList<PersoanaCuCont> urmaritori, ArrayList<PersoanaCuCont> persoanaUrmarite, ArrayList<Media> medii, ArrayList<Postare> postariPremium) {
    super(numeUtilizator, urmaritori, persoanaUrmarite, medii);
    this.postariPremium = postariPremium;
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