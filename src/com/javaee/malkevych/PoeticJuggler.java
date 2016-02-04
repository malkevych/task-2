package com.javaee.malkevych;

import sun.awt.image.ImageWatched;

import java.util.List;

public class PoeticJuggler extends Juggler{
    private Poem poem;
    private int tet;
    private List<String> collectionDi;
    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }
    public PoeticJuggler(int beanBags, Poem poem){
        super(beanBags);
        this.poem = poem;
    }
    public void perform(){
        super.perform();
        System.out.println("While reciting ...");
        System.out.println("CONSTRUCTOR DI");
        poem.recite();
        System.out.println("METHOD DI " + tet);
        System.out.println("COLLECTION DI");
        for(String str : collectionDi){
            System.out.println(str);

        }
    }

    public void setTet(int tet) {
        this.tet = tet;
    }

    public void setCollectionDi(List<String> collectionDi) {
        this.collectionDi = collectionDi;
    }
}
