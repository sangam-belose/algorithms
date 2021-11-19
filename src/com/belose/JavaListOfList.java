package com.belose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaListOfList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int numberOfLines = scan.nextInt();
        scan.nextLine();
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int i = 1;
        while (scan.hasNextLine() && i != numberOfLines) {
            String line = scan.nextLine();
            String[] num = line.split(" ");
            ArrayList<Integer> numbers = Arrays.stream(num)
                    .map(Integer::valueOf)
                    .collect(Collectors.toCollection(ArrayList::new));

            list.add(numbers);
        }

        for (ArrayList<Integer> enList : list) {
            System.out.println(enList.size());
        }

        // int numberOfQueries = scan.nextInt();
        // for(int i = 0; i<numberOfQueries; i++) {
        //     int row = scan.nextInt();
        //     int column = scan.nextInt();
        //     int value = list.get(row).get(column);
        //     if(value != null) {
        //         System.out.println(value);
        //     } else {
        //         System.out.println("ERROR!");
        //     }
        // }
    }
}
