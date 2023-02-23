import java.util.Scanner;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class Dll{
    Node head = null;

    boolean notEmpty(){
        if (head == null){
            return false;
        }else{
            return true;
        }
    }

    void add(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null){
            head = newNode;
            newNode.prev = null;
        }else{
            Node ptr = head;
            while (ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = newNode;
            newNode.prev = ptr;
        }
    }

    void addFront(int data){
        Node newNode = new Node(data);
        newNode.prev = null;
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void insert (int pos,int data){
        Node newNode = new Node(data);
        Node ptr = head;
        int index = 0;
        while(index != pos){
            ptr = ptr.next;
            index++;
        }
        ptr.prev.next = newNode;
        newNode.prev = ptr.prev;
        newNode.next = ptr;
        ptr.prev = newNode;
    }

    void display(){
        if( !notEmpty()){
            System.out.println("List is empty\n");
        }else{
            Node ptr = head;
            while(ptr != null){
                System.out.print(ptr.data+"\t");
                ptr = ptr.next;
            }
            System.out.println("\n");
        }
    }

    void delete(int data){
        if ( !notEmpty()){
            System.out.println("List is empty\n");
        }else{
            Node ptr = head;
            while(ptr.data != data){
                ptr = ptr.next;
            }
            ptr.prev.next = ptr.next;
            ptr.next.prev = ptr.prev;
        }
    }

    void deleteFirst(){
        if (!notEmpty()){
            System.out.println("List is empty\n");
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    void deleteLast(){
        if (!notEmpty()){
            System.out.println("List is empyt\n");
        }else{
            Node ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.prev.next = null;
        }
    }

}   
public class DoubleLinked {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        Dll list = new Dll();
        int ch = 0,data,pos;
        while(ch != 8){
            System.out.println("1.Add\n2.AddFront\n3.Insert\n4.Display\n5.DeleteLast\n6.DeleteFirst\n7.Delete\n8.Exit\nChoose an option");
            ch = sc.nextInt();
            if (ch == 1){
                System.out.print("Enter data : ");
                data = sc.nextInt();
                list.add(data);
            }else if (ch == 2){
                System.out.print("Enter data : ");
                data = sc.nextInt();
                list.addFront(data);
            }else if (ch == 3){
                System.out.print("Enter data : ");
                data = sc.nextInt();
                System.out.print("Enter possiton to insert : ");
                pos = sc.nextInt();
                list.insert(pos,data);
            }else if (ch == 4){
                list.display();
            }else if (ch == 5){
                list.deleteLast();
            }else if(ch == 6){
                list.deleteFirst();
            }else if (ch == 7){
                System.out.print("Enter data to delete : ");
                data = sc.nextInt();
                list.delete(data);
            }else if (ch == 8){
                System.out.println("Exit");
            }else{
                System.out.println("Enter correct option");
            }
        }
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.addFront(90);
        // list.insert(3,4);
        // list.display();
        // list.deleteLast();
        // list.display();
        // list.deleteFirst();
        // list.display();
        // list.delete(20);
        // list.display();
    }
}