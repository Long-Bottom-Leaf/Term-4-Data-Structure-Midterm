package services;

import model.PatientRecord;

public class PatientHistory {

    private Node head;
    private Node tail;
    private Node current;

    // private inner node
        private static class Node {
            PatientRecord data;
            Node next;
            Node previous;

            Node(PatientRecord data) {
                this.data = data;
            }
        }

    public PatientHistory() {
        head = null;
        tail = null;
        current = null;
    }

    // add record to end of history
        public void addRecord(PatientRecord record) {
            Node newNode = new Node(record);

            if (head == null) {
                head = newNode;
                tail = newNode;
                current = newNode;

            } else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
                current = newNode;
            }
        }

    // move to next record
        public PatientRecord nextRecord() {
            if (current == null || current.next == null) {
                return null;
            }

            current = current.next;
            return current.data;
        }

    // move to previous record
        public PatientRecord previousRecord() {
            if (current == null || current.previous == null) {
                return null;
            }

            current = current.previous;
            return current.data;
        }

    // newest record
        public PatientRecord getNewest() {
            if (tail == null) return null;
            current = tail;
            return current.data;
        }

    // oldest record
        public PatientRecord getOldest() {
            if (head == null) return null;
            current = head;
            return current.data;
        }

    // current record
        public PatientRecord getCurrent() {
            if (current == null) return null;
            return current.data;
        }

    // size for testing purposes
        public int size() {
            int count = 0;
            Node temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            return count;
        }
}
