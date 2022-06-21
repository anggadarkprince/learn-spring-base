package com.anggaari.learnspring;

public class Database {
    private static Database instance;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

    private Database() {

    }
}
