package com.belose.codility.stackandqueue.nesting;

import java.util.Stack;

/**
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
 */

public class Nesting {

    public int isStringProperlyNested(String input){
        Stack<Character> store = new Stack<>();
        for(char letter: input.toCharArray()) {
            if(letter == '(')
                store.push(letter);
            else if(letter == ')'){
                if(store.isEmpty() || store.pop() != '(')
                    return 0;
            } else {
                return 0;
            }

        }
        if(store.isEmpty())
            return 1;
        else
            return 0;
    }




}
