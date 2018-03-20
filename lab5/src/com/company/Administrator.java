package com.company;

import java.util.ArrayList;

public class Administrator extends Persoana {

  public ArrayList<Persoana> persoane;

  public Administrator() {
    super();
  }

  public ArrayList<Persoana> getPersoane() {
    return persoane;
  }

  public void setPersoane(ArrayList<Persoana> persoane) {
    this.persoane = persoane;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Administrator{" +
            "persoane=" + persoane +
            '}';
  }
}