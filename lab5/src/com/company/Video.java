package com.company;
public class Video extends Media {

  public Double durata;

  public Video(Double durata) {
    this.durata = durata;
  }

  public Double getDurata() {
    return durata;
  }

  public void setDurata(Double durata) {
    this.durata = durata;
  }

  @Override
  public String toString() {
    return "Video{" +
            "durata=" + durata +
            ", descriere='" + descriere + '\'' +
            ", continut='" + continut + '\'' +
            '}';
  }
}