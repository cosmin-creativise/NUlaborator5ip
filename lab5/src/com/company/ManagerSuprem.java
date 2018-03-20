package com.company;

public class ManagerSuprem {
    private static ManagerSuprem ourInstance = new ManagerSuprem();

    private String nume;
    public static ManagerSuprem getInstance() {
        return ourInstance;
    }

    private ManagerSuprem() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "ManagerSuprem{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
