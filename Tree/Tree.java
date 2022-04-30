import java.util.Scanner;

public class Tree{
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=createTree();
       System.out.println("inorder");
       inorder(root);
       System.out.println("preorder");
       preOrder(root);
       System.out.println("postorder");
       postOrder(root);

    }
    static Node createTree(){
        Node root=null;
        System.out.println("Enter data");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter data for left "+ data);
        root.left=createTree();
        System.out.println("Enter data for right "+ data);
        root.right=createTree();
        return root;
    }
    static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" -> ");
        preOrder(root.left);
        preOrder(root.right);

    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" -> ");
        inorder(root.right);

    }
    static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" -> ");

    }

}
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}