package org.prog3.lab2.generics.ex1.model;

import java.util.List;

public class Queue<T>{

    private List<T> list;

    public Queue(List<T> list) {
        this.list = list;
    }

    public void enqueue(T value){
        list.add(value);
    }

    public T dequeue(){
        if(!list.isEmpty())
            return list.remove(0);
        else
            return null;

    }

    public boolean empty(){
        return list.isEmpty();
    }

}
