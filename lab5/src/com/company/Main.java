package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String argv[]) {

        ArrayList<Postare> postari = new ArrayList<Postare>();
        ArrayList<Media> continut = new ArrayList<Media>();
        ArrayList<Persoana> persoane = new ArrayList<Persoana>();
        ArrayList<Comentariu> comentarii = new ArrayList<Comentariu>();
        ArrayList<PersoanaCuCont> persoaneCuCont = new ArrayList<PersoanaCuCont>();



        ManagerSuprem managerSuprem = ManagerSuprem.getInstance();
        managerSuprem.setNume("Manager Superm 1");

        ManagerSuprem managerSuprem1 = ManagerSuprem.getInstance();
        managerSuprem1.setNume("Manager Superm 2");
        Administrator administrator = new Administrator();




        Comentariu comentariu = new Comentariu("COMENTARIU");
        FotografProfesionist fotografProfesionist = new FotografProfesionist("ionel");
        Imagine imagine = new Imagine(100);
        Media media = new Media();
        Persoana persoana = new Persoana();
        persoana.setNume("buce");
        persoana.setPrenume("alex");
        persoana.setId(12);
        comentarii.add(comentariu);
        PersoanaCuCont persoanaCuCont = new PersoanaCuCont("abc");
        persoanaCuCont.setNume("marius");
        persoanaCuCont.setPrenume("parasca");
        persoanaCuCont.setId(112);

        PersoanaFaraCont persoanaFaraCont = new PersoanaFaraCont();
        persoanaFaraCont.setNume("cotofana");
        persoanaFaraCont.setPrenume("victor");
        persoanaFaraCont.setId(22);


        Postare postare = new Postare();
        UtilizatorObisnuit utilizatorObisnuit = new UtilizatorObisnuit("vasile");
        Video video = new Video(50.0);
        comentarii.add(comentariu);
        media.setContinut("continut");
        media.setDescriere("descriere");


        video.setDurata(12.0);
        video.setContinut("con1");
        video.setDescriere("desc1");

        postare.setMedia(media);
        postare.setComentarii(comentarii);
        postare.setPersoaneCareApreciaza(persoaneCuCont);
        utilizatorObisnuit.setPostariObisnuite(postari);
        persoane.add(persoana);
        postari.add(postare);
        continut.add(media);
        continut.add(imagine);
        continut.add(video);
        administrator.setPersoane(persoane);
        fotografProfesionist.setPostariPremium(postari);
        persoanaCuCont.setPersoanaUrmarite(persoaneCuCont);
        persoanaCuCont.setUrmaritori(persoaneCuCont);
        persoanaFaraCont.setPostarePublica(postari);

        System.out.println(managerSuprem);
        System.out.println(administrator);
        System.out.println(comentariu);
        System.out.println(fotografProfesionist);
        System.out.println(imagine);
        System.out.println(media);
        System.out.println(persoana);
        System.out.println(persoanaCuCont);
        System.out.println(persoanaFaraCont);
        System.out.println(postare);
        System.out.println(utilizatorObisnuit);
        System.out.println(video);



    }
}
