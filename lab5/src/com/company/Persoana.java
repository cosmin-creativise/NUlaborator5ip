package com.company;
public class Persoana {

  public String nume;

  public String prenume;

  public Integer id;

  public Persoana()
  {

  }

  public Persoana(String nume, String prenume, Integer id) {
    this.nume = nume;
    this.prenume = prenume;
    this.id = id;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public String getPrenume() {
    return prenume;
  }

  public void setPrenume(String prenume) {
    this.prenume = prenume;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Persoana{" +
            "nume='" + nume + '\'' +
            ", prenume='" + prenume + '\'' +
            ", id=" + id +
            '}';
  }
}