package com.javaee.malkevych;

/**
 * Created by Bohdan on 05.02.16.
 */
public class RepPoem implements Poem {
    private static final String REP = "When I die, Ima legend!";
    @Override
    public void recite() {
        System.out.println(REP);
    }
}
