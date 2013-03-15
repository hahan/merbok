package com.hahan.merbok.main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MerbokTest {

    @Test
    public void merbokWithJustOneMerb() {
        Merbok merbok = new Merbok("First Merb, guys!");
        String actualMerb = merbok.get();
        assertEquals("First Merb, guys!", actualMerb);
    }

}
