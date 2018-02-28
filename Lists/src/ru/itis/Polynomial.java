package ru.itis;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Polynomial {
    Node poly;

    public Polynomial() {
        poly = null;
    }

    public Polynomial(BufferedReader bf) throws IOException {
        String line;
        StringTokenizer tokenizer;
        int coeff;
        int degree;
        poly = null;
        while ((line = bf.readLine()) != null) {
            tokenizer = new StringTokenizer(line);
            coeff = Integer.parseInt(tokenizer.nextToken());
            degree = Integer.parseInt(tokenizer.nextToken());
            poly = new Node(coeff, degree, poly);
        }
    }

    private Node addInsert(Node ins, Node list) {
        Node temp = new Node(ins.term.coeff, ins.term.degree, null);
        if (list == null) {
            return temp;
        } else {
            Node curr = list;
            Node prev = null;
            while (curr != null) {
                if (temp.term.degree > curr.term.degree) {
                    if (curr.next != null) {
                        curr.next = temp;
                        return list;
                    }
                    prev = curr;
                    curr = curr.next;
                } else if (temp.term.degree == curr.term.degree) {
                    if (curr.term.coeff + temp.term.coeff == 0) {
                        if (prev == null) {
                            return curr.next;
                        } else {
                            prev.next = curr.next;
                            return list;
                        }
                    }
                    if (prev == null) {
                        list = new Node(curr.term.coeff + temp.term.coeff, curr.term.degree, curr.next);
                    } else {
                        prev.next = new Node(curr.term.coeff + temp.term.coeff, curr.term.degree, curr.next);
                    }
                    return list;
                } else if (temp.term.degree < curr.term.degree) {
                    temp.next = curr;
                    prev.next = temp;
                    return list;
                }
            }
        }
        return null;
    }

    public Polynomial add(Polynomial p) {
        Node sum = null;
        Node curr = this.poly;
        Node currp = p.poly;
        while (curr != null) {
            sum = addInsert(curr, sum);
            curr = curr.next;
        }
        while (curr != null) {
            sum = addInsert(currp, sum);
            currp = currp.next;
        }
        Polynomial summ = new Polynomial();
        summ.poly = sum;
        return summ;
    }

    public int evaluate(int x) {
        int value = 0;
        Node curr = poly;
        while (curr != null) {
            value += curr.term.coeff * ((int) Math.pow(x, curr.term.degree));
            curr = curr.next;
        }
        return value;
    }
//нужно поработать над удалением
    /*
    public Polynomial deleteOdd() {
        Polynomial del = new Polynomial();
        Node curr = poly;
        Node ptr, save;
        save = poly;
        ptr = poly.next;
        while (ptr != null) {
            if ((ptr.term.degree/2)==1){
            Node next = ptr.next;
            save.next = next;
            ptr = next;
        } else {
        save = ptr;
        ptr = next;
        }
        del.poly = poly;
        return del;
    }

    public Polynomial delete(int degree) {
        Node curr = poly;
        Node save;
        save = poly;
        ptr = poly.next;
        Polynomial delOdd = new Polynomial();
        while (ptr != null) {
            if ((ptr.term.degree / 2) == 1) {
                Node next = ptr.next;
                save.next = next;
                ptr = next;
            } else {
                save = ptr;
                ptr = next;
            }
        }
        delOdd.poly = poly;
        return delOdd;
    }
    */

    //работает
    public Polynomial derivate() {
        Node curr = poly;
        while (curr != null) {
            curr.term.coeff = curr.term.coeff * curr.term.degree;
            curr.term.degree--;
            curr = curr.next;
        }
        Polynomial deriv = new Polynomial();
        deriv.poly = poly;
        return deriv;
    }

    public Polynomial combine() {
        Node curr = poly;
        Node temp = null;
        while (curr!=null){
            if (curr.term.degree>curr.next.term.degree){
                temp = curr;
                curr = curr.next;
                curr.next = temp;
            }
            if (curr.term.degree==curr.next.term.degree){
                if (curr.term.coeff > 0 & curr.next.term.coeff<0){
                    curr.term.coeff = curr.term.coeff - curr.next.term.coeff;
                    curr = curr.next;
                } else {
                    curr.term.coeff = curr.term.coeff + curr.next.term.coeff;
                    curr = curr.next;
                }
            }
        }
        Polynomial combine = new Polynomial();
        combine.poly = this.poly;
        return combine;
    }

//работает
    public String toString() {
        String retval;
        if (poly == null) {

            return "0";
        } else {
            retval = poly.term.toString();
            for (Node current = poly.next;
                 current != null;
                 current = current.next) {
                retval = current.term.toString() + " + " + retval;
            }
            return retval;
        }
    }
}
