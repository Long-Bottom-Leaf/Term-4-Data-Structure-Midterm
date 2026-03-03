package services;

import model.PatientRecord;
import org.w3c.dom.Node;

public class PatientHistory {

    private Node head;
    private Node tail;
    private Node current;

    // private inner node
    private class Node {
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

    }
}
