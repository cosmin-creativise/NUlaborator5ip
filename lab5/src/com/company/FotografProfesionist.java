package com.company;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;

public class FotografProfesionist extends PersoanaCuCont {

  public ArrayList<Postare> postariPremium;

  public ArrayList<Postare> getPostariPremium() {
    return postariPremium;
  }


  public FotografProfesionist(String numeUtilizator) {
    super(numeUtilizator);
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