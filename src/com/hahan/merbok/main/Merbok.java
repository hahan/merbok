package com.hahan.merbok.main;

/**
 * A Twitter-like app with a new name.
 */
public class Merbok {

    /**
     * as in tweet for twitter
     */
    private final String merb;

    /**
     * Simplest Merbok with a single merb!
     *
     * @param merb A merb as in tweet.
     */
    public Merbok(String merb) {
        this.merb = merb;
    }

    public String get() {
        return merb;
    }
}
