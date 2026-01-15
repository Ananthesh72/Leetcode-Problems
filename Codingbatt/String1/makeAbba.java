package String1;

public class makeAbba {

    // makeAbba("Hi", "Bye") → "HiByeByeHi"
    // makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    // makeAbba("What", "Up") → "WhatUpUpWhat"

    public static void main(String[] args) {
        makeAbba obj = new makeAbba();
        System.out.println(obj.makeAbba("Hi", "Bye"));
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

}
