package ru.itis;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {
    private static int length;


    private static class Node<T> {
        T value;
        Node<T> next;


        Node(T value) {
            this.value = value;
        }
    }

    // ссылка на первый элемент списка
    private static Node head;
    // ссылка на последний элемент списка
    private static Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    @Override
    public T get(int index) {
        int currentIndex = 0;
        Node<T> temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.value;
            } else {
                temp = temp.next;
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void addToBegin(T object) {
        Node newNode = new Node(object);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        this.length ++;
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        tail.next = newNode;
        tail = newNode;
        this.length++;
    }

    public void reverse() {
        Node<T> temp = head;
        Node<T> prev = null;
        while (temp != null) {
            Node<T> next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }

    @Override
    public void remove(T element) {
        Node<T> temp = head;
        Node<T> ptr = temp.next;
        while (head.value == element) {
            head = head.next;
        }
        while (ptr != null) {
            if (ptr.value == element) {
                Node<T> next = ptr.next;
                temp.next = next;
                ptr = next;
                length--;
            } else {
                temp = ptr;
                ptr = ptr.next;
            }
        }
    }

    public void printList() {
        Node<T> node = head;
        while (node != null) {
            System.out.println(node.value + " ");
            node = node.next;
        }
    }

    @Override
    public boolean contains(T element) {
        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.value.equals(element)) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public int size() {
        return length;
    }


    public static<T extends Comparable<? super T>> LinkedList merge(LinkedList<T> list1, LinkedList<T> list2) {
        LinkedList<T> result = new LinkedList();
        Node<T> temp1 = list1.head;
        Node<T> temp2 = list2.head;
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        while (temp1 != null && temp2 != null) {
            if (result.head == null) {
                if (temp1.value.compareTo(temp2.value) > 0) {
                    result.addToBegin(temp1.value);
                    temp1 = temp1.next;
                } else {
                    result.addToBegin(temp2.value);
                    temp2 = temp2.next;
                }
            } else {
                if (temp1.value.compareTo(temp2.value) > 0) {
                    result.add(temp1.value);
                    temp1 = temp1.next;
                } else {
                    result.add(temp2.value);
                    temp2 = temp2.next;
                }
            }

            if (temp2 != null) {
                result.add(temp2.value);
                temp2 = temp2.next;
            } else {
                result.add(temp1.value);
                temp1 = temp1.next;
            }
        }
        return result;
    }

    public <T extends Comparable<? super T>>LinkedList sort(){
        LinkedList[] lists = new LinkedList[31];
        for(int i = 0; i < lists.length; i++){
            lists[i] = new LinkedList();
        }
        Node<T> curr = head.next.next;
        int index = 1;
        lists[0].add(this.head.value);
        lists[1].add(this.head.next.value);
        while (curr !=null || lists[1].length > 0){
            if (lists[index].length == lists[index - 1].length || curr==null){
                lists[index-1] = merge(lists[index], lists[index - 1]);
                lists[index] = new LinkedList();
                if (index > 1){
                    index --;
                    continue;
                }
            } else index++;
            if (curr == null) continue;
            lists[index].add(curr.value);
            if (curr !=null) curr = curr.next;
        }
        return lists[0];
    }

    private static boolean isEmpty(){
        Node temp = head;
        if (temp == null){
            return true;
        }
        return false;
    }

    public static<T extends Comparable<? super T>> LinkedList mergeWithIterators(LinkedList<T> a, LinkedList<T>b){
        LinkedList result = new LinkedList();
        Iterator<T> aIter = new LinkedListIterator<T>();
        Iterator<T> bIter = new LinkedListIterator<T>();
        while (aIter.hasNext() && bIter.hasNext()){
            if (result.head == null){
                if ((aIter.next().compareTo(bIter.next())>0)){
                    result.addToBegin(aIter.next());
                } else {
                    result.addToBegin(bIter.next());
                }
            } else {
                if (aIter.next().compareTo(bIter.next()) > 0){
                    result.add(aIter);
                } else {
                    result.add(bIter);
                }
            }
            if (aIter.hasNext() == false){
                result.add(bIter);
            } else {
                result.add(aIter);
            }
        }
        return result;
    }

    private static class LinkedListIterator<T> implements Iterator {
        public int currentCount;
        Node<T> curr = null;
        Node<T> temp = head;

        @Override
        public boolean hasNext() {
            return !isEmpty() && curr != tail;
        }

        @Override
        public T next() {
            if (isEmpty()){
                throw new NoSuchElementException();
            } else if (curr == null){
                curr = temp;
                return temp.value;
            }  else if (curr.next == null){
                throw new NoSuchElementException();
            }
            curr = curr.next;
            return curr.value;
        }
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }
}









