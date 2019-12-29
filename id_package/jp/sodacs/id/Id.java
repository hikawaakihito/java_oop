package jp.sodacs.id;

import java.util.Random;

public class Id{
    private static int counter;

    private int id;

    static{
        Random rand = new Random();
        counter = rand.nextInt(10) * 10000;
    }

    public Id(){
        id = ++counter;
    }

    public int getId(){
        return id;
    }
}