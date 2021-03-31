package Chapter2;
import java.util.*;  

public class RemoveDup {
    
    Node head;

    public static void main(String[] args) {
        Node fir = new Node(1);
        Node sec = new Node(3);
        Node thir = new Node(4);
        Node fourth = new Node(6);

        fir.next = sec;
        sec.next = thir;
        thir.next = fourth;
        fourth.next = null;

        System.out.println(countNodes(fir));
        removeDuplicates(fir);
        System.out.println(countNodes(fir));
        
    }
    /* Node Class */
    class Node {
        int data; 
        Node next; 
        
        // Constructor to create a new node 
        Node(int d) {
            this.data = d; 
            this.next = null;
        } 
    }   

    void addNode(int data) { 
        Node cur = new Node(data);
        cur.next = this.head;
        head = cur;
    }

    static int countNodes(Node head) {
        int count = 0;
        Node cur = head;


        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    void deleteNode(int key) {
    
        Node cur = this.head, prev = null;
 
        if (cur != null && cur.data == key) {
            head = cur.next; // Changed head
            return;
        }
 
        while (cur != null && cur.data != key) {
            prev = cur;
            cur = cur.next;
        }
 
        if (cur == null)
            return;
 
        prev.next = cur.next;
    }

    void removeDuplicates(Node head) {

        Node cur = head;
        Node tmp = null;
        
        while (cur != null) {
            tmp = cur;
            while (tmp != null) {
                if (tmp.data != cur.data) {
                    tmp = tmp.next;
                }
                else {
                    deleteNode(tmp.data);
                }
            }
            cur = cur.next;
        }

    }

}

