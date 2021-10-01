package com.belose.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * This is my custom implementation of stack. The original stack from java uses Vector in its
 * implementation.
 */
public class StackFromScratch {

    public static void main(String[] args) {
        StackModel<Integer> integerStackModel = new StackModel<>();
        integerStackModel.push(20);
        integerStackModel.push(30);
        integerStackModel.push(40);
        integerStackModel.push(50);

        System.out.println("Size of stack: " + integerStackModel.size());

        System.out.println("Removing item from stack:" + integerStackModel.pop());

        System.out.println("Size of stack after removal: " + integerStackModel.size());

        System.out.println("Return firstElement from top: " + integerStackModel.peek());

    }
}

class StackModel<E> {

    List<E> dataList = new ArrayList<>();

    public int size() {
        return dataList.size();
    }

    public E push(E data) {
        this.dataList.add(data);
        return data;
    }

    /**
     * To remove the element from stack
     *
     * @return E
     */
    public E pop() {
        if (!dataList.isEmpty()) {
            int indexToPop = dataList.size() - 1;
            return dataList.remove(indexToPop);
        }
        return null;
    }

    /**
     * To retrieve element present at the top of the Stack
     *
     * @return E
     */
    public E peek() {
        int topElementIndex = this.size() - 1;
        return this.dataList.get(topElementIndex);
    }
}

