import java.util.Scanner;

public class maximum_node {
    static Scanner input=null;
    public static void main(String[] args) {
         input = new Scanner(System.in);
         Node root=newTree();
        // System.out.println("Greater Node -> "+maximum(root));
        // preordreTraverse(root);
         int num=height(root);
         System.out.println("Height : "+num);
         for (int i = 0; i < num; i++) {
             print(root,i);

         }
    }
    static void print(Node root,int level){
        if(root==null){
            return;
        }
        if(level==0){
            System.out.print(root.data +" -> ");
        }
        if(level>0){
            print(root.left,level-1);
            print(root.rigth,level-1);
        }
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.rigth))+1;
    }
    static Node newTree(){
        Node root=null;
        System.out.println("Enter data ");
        int data=input.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter data for left "+data);
        root.left=newTree();
        System.out.println("Enter data for rigth "+data);
        root.rigth=newTree();
        return root;
    }
    static int maximum(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.rigth)));
    }
    static void preordreTraverse(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data +" -> ");
        preordreTraverse(root.left);
        preordreTraverse(root.rigth);
    }
}
class Node{
    Node left,rigth;
    int data;
    Node(int data){
        this.data=data;
        this.left=null;
        this.rigth=null;
    }
}
