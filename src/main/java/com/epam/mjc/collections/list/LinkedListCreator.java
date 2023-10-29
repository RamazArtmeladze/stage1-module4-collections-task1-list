package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();

        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                result.addLast(num); // Insert even numbers at the end
            } else {
                result.addFirst(num); // Insert odd numbers at the beginning
            }
        }

        return result;
    }
}

