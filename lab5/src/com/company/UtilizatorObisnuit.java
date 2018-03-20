package com.company;

import java.util.ArrayList;

public class UtilizatorObisnuit extends PersoanaCuCont {

  public ArrayList<Postare> postariObisnuite;





  public UtilizatorObisnuit(String numeUtilizator) {
    super(numeUtilizator);

  }

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