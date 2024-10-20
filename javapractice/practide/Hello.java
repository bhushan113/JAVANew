package javapractice.practide;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Node{
    int data;
    Node right,down;
    Node(int data){
        this.data=data;
        this.right=null;
        this.down=null;
    }
}
class Hello{
    static Node construct(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        Node mainhead=null;
        ArrayList<Node> head=new ArrayList<>(m);
        Node rcurr=null;
        for(int i=0;i<m;i++){
            head.add(null);
            for(int j=0;j<n;j++){
                Node newptr=new Node(arr[i][j]);
                if(mainhead==null){
                    mainhead=newptr;
                }
                if(head.get(i)==null){
                    head.set(i,newptr);
                }else
                {
                    rcurr.right=newptr;
                }
                rcurr=newptr;
            }
        }
        for(int i=0;i<m;i++){
            Node curr1=head.get(i);
            Node curr2=head.get(i+1);
            while(curr1!=null &&curr2!=null){
                curr1.down=curr2;
                curr1=curr1.right;
                curr2=curr2.right;
            }
        }
        return mainhead;
    }
    static void printList(Node head){
        Node currrow=head;
        while(currrow!=null){
            Node currcol=currrow;
            while(currcol!=null){
                System.out.println(currcol.data+" ");
                currcol=currcol.right;
            }
            System.out.println() ;
            currrow=currrow.down;
        }
    }

    public static void main(String[] args) {
        int arr[][]={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        Node head=construct(arr);
        printList(head);
    }
}
