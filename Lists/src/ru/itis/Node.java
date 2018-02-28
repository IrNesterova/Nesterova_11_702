package ru.itis;

public class Node {
    Term term;
    Node next;
    Node prev;
    public Node (int coeff, int degree, Node next){
        term = new Term(coeff, degree);
        this.next = next;
        this.prev = prev;
    }
}
