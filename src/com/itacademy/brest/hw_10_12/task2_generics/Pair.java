package com.itacademy.brest.hw_10_12.task2_generics;

public class Pair<T, N> {

    private T t;
    private N n;

    public Pair(T t, N n) {
        this.t = t;
        this.n = n;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public N getN() {
        return n;
    }

    public void setN(N n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "t=" + t +
                ", n=" + n +
                '}';
    }
}