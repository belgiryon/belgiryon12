package com.company;

import static com.company.MySingleLinkedList.*;

public class Main {

    public static void main(String[] args) {
        push( 15);
        push( -14);
        push( 13);
        push( -22);
        push( 17);
        System.out.println("Linked list is : ") ;
        printList(head);
        System.out.print("Maximum element in linked list: ");
        System.out.println(largestElement(head));
        System.out.print("Minimum element in linked list: ");
        System.out.print(smallestElement(head));
    }
}

