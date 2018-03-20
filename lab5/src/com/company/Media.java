package com.company;
public class Media {

  public String descriere;

  public String continut;

  public Media(){

  }

  public Media(String descriere, String continut) {
    this.descriere = descriere;
    this.continut = continut;
  }

  public String getDescriere() {
    return descriere;
  }

  public void setDescriere(String descriere) {
    this.descriere = descriere;
  }

  public String getContinut() {
    return continut;
  }

  public void setContinut(String continut) {
    this.continut = continut;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Media{" +
            "descriere='" + descriere + '\'' +
            ", continut='" + continut + '\'' +
            '}';
  }
}
