package com.company;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;

public class UtilizatorObisnuit extends PersoanaCuCont {

  public ArrayList<Postare> postariObisnuite;

  public UtilizatorObisnuit(String numeUtilizator, ArrayList<PersoanaCuCont> urmaritori, ArrayList<PersoanaCuCont> persoanaUrmarite, ArrayList<Media> medii, ArrayList<Postare> postariObisnuite) {
    super(numeUtilizator, urmaritori, persoanaUrmarite, medii);
    this.postariObisnuite = postariObisnuite;
  }

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