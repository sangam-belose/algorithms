package com.belose.codility;

import com.belose.LinkedList.usingInterface.LinkedList;
import java.util.Stack;

/**
 * A string S consisting of N characters is considered to be properly nested if any of the following
 * conditions is true:
 * <p>
 * S is empty; S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string; S has the
 * form "VW" where V and W are properly nested strings. For example, the string "{[()()]}" is
 * properly nested but "([)()]" is not.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(String S); }
 * <p>
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0
 * otherwise.
 * <p>
 * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the
 * function should return 0, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..200,000]; string S consists only of the following
 * characters: "(", "{", "[", "]", "}" and/or ")".
 */
public class Brackets {

    public static void main(String[] args) {
        System.out.println(solution("{[()()]}"));
        System.out.println(solution("{[())]}"));
        System.out.println(solution("{[)]}"));
    }

    public static int solution(String S) {
        Stack<Character> store = new Stack<>();
        if (S.isEmpty()) {
            return -1;
        }

        char[] symbols = S.toCharArray();
        for (char item : symbols) {
            if (item == '(' || item == '{' || item == '[') {
                store.push(item);
            } else if (item == ')') {
                if (store.isEmpty() || store.pop() != '(') {
                    return 0;
                }
            } else if (item == '}') {
                if (store.isEmpty() || store.pop() != '{') {
                    return 0;
                }
            } else if (item == ']') {
                if (store.isEmpty() || store.pop() != '[') {
                    return 0;
                }
            }
        }

        return store.isEmpty() ? 1 : 0;
    }

}
