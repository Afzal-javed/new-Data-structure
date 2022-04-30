import java.util.Scanner;

public class Height_of_BT {
   static Scanner input=null;
    public static void main(String[] args) {
        input=new Scanner(System.in);
        Node root=tree();
        System.out.println(height(root));
       inorder(root);
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height( root.right))+1;
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" -> ");
        inorder(root.right);
    }
    static Node tree(){
        Node root=null;
        System.out.println("enter data");
        int data=input.nextInt();

        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter data for left "+ data);
        root.left=tree();
        System.out.println("Enter data for right " + data);
        root.right=tree();
        return root;
    }
    
}
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
