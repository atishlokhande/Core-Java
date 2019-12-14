package data_structure_java;

//import javax.xml.soap.Node;

public class LinkedListDemo {

    Node head;

    class Node{

        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void printNthFromLast(int n) {
        int len = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }
            if (len < n)
                return;

            temp = head;

           for (int i = 1; i < len - n + 1; i++)
                temp = temp.next;

            System.out.println(temp.data);
    }
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    public static void main(String args[]){
        LinkedListDemo llist = new LinkedListDemo();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        llist.printNthFromLast(4);
    }
}
