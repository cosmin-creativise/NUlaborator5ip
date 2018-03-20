package com.company;

public class ManagerSuprem {
    private static ManagerSuprem ourInstance = new ManagerSuprem();

    public static ManagerSuprem getInstance() {
        return ourInstance;
    }

    private ManagerSuprem() {

    }
}
