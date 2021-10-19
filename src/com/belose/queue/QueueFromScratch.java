package com.belose.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QueueFromScratch {

    public static void main(String[] args) {
        QueueModel<Integer> queueModel = new QueueModel<>();

        System.out.println("Adding element: " + queueModel.enqueue(10));
        System.out.println("Adding element: " + queueModel.enqueue(20));
        System.out.println("Check Size: " + queueModel.size());

        System.out.println("removing element: " + queueModel.dequeue());
        System.out.println("Check Size: " + queueModel.size());
        System.out.println(queueModel);

    }
}

class QueueModel<E> {

    private List<E> dataList = new ArrayList<>();
    private int size;

    public boolean enqueue(E element) {
        size++;
        return dataList.add(element);
    }

    public E dequeue() {
        size--;
        return dataList.remove(0);
    }

    public int size() {
        return size;
    }

    public String toString() {
        String dataString = this.dataList.stream().map(String::valueOf)
                .collect(Collectors.joining(","));
        return new StringBuilder().append("[ ").append(dataString).append(" ]").toString();
    }
}
