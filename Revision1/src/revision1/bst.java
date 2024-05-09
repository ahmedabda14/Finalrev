/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision1;


class node{
    int data;
    node left;
    node right;
    public node(int data){
        this.data=data;
    }
   
}
public class bst {
    public static node root;

    public bst() {
        this.root=null;
    }
    
public void insert(int id) {
    node newNode = new node(id);

    if (root == null) {
        root = newNode;
        return;
    }

    node current = root;
    node parent = null;

    // Use a boolean flag to exit the loop instead of while (true)
    boolean inserted = false;
    while (!inserted) {
        parent = current;
        if (id < current.data) {
            if (current.left == null) {
                parent.left = newNode;
                inserted = true;
            } else {
                current = current.left;
            }
        } else {
            if (current.right == null) {
                parent.right = newNode;
                inserted = true;
            } else {
                current = current.right;
            }
        }
    }
}//end of insert
     
     
public void display(node root){
    if(root!=null){
        display(root.left);
        System.out.print(" "+root.data);
       display(root.right);
    }
} //end of display

public boolean find(int id){
    node current = root;
    while(current!=null){
        if(current.data==id)
            return true;
        else if(current.data>id)
            current = current.left;
        else
            current=current.right;
    }
    return false;
} // end of find 

public boolean delete(int id){
    node parent = root;
    node current = root;
    boolean isLeftChild = false;
    while(current.data!=id){
        parent = current;
        if(current.data>id){
            isLeftChild = true;
            current = current.left;
        }else{
            isLeftChild=false;
            current=current.right;
        }
        if(current==null)
            return false;
    }
    //node found
    //case 1: if node to be deleted has no children
    if(current.left==null&&current.right==null){
        if(current==root){
            root=null;
        }
        if(isLeftChild==true){
            parent.left=null;
        }else{
            parent.right=null;
        }
    }
    // case2: if node to be deleted has only one child
    else if(current.right==null){
        if(current==root){
            root=current.left;
        }else if(isLeftChild){
            parent.left=current.left;
        }else
            parent.right=current.left;
    }
    else if(current.left==null){
        if(current==root){
            root=current.right;
        }else if(isLeftChild){
            parent.right=current.right;
        }else
            parent.right=current.right;
    }else if(current.left!=null&&current.right!=null){
        //Minimum element in the right subTree is found
        
        node successor = getSuccessor(current);
        if(current==root){
            root=successor;
        }else{
            parent.right=successor;
        }
        successor.left=current.left;
    }
    
    return true;
}
     public node getSuccessor(node deleteNode){
         node successor=null;
         node successorParent =null;
         node current=deleteNode.right;
         while(current!=null){
             successorParent=successor;
             successor = current;
             current=current.left;
         }
         //check if successor has right child (cannot have left)
         
         //if it has the right child add it to the left of successorParent
         
         if(successor!=deleteNode.right){
             successorParent.left=successor.right;
             successor.right=deleteNode.right;
         }
         return successor;   
     }
     public int findMinimum(node root) {
    if (root == null) {
        throw new IllegalArgumentException("The binary search tree is empty.");
    }

    node current = root;
    while (current.left != null) {
        current = current.left;
    }

    return current.data;
}
     public int findMax() {
        if (root == null) {
            throw new IllegalStateException("Binary search tree is empty.");
        }

        node current = root;

        // Loop until the rightmost node is found
        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }
             public static void main(String[] args) {
                 bst b = new bst();
                 b.insert(3);                 b.insert(8);
                 b.insert(1);                 b.insert(4);
                 b.insert(6);                 b.insert(2);
                 b.insert(10);                 b.insert(9);
                 b.insert(20);                 b.insert(25);
                 b.insert(15);                b.insert(16);

                 System.out.println("original tree: ");
                 b.display(b.root);
                 System.out.println();
                 System.out.println(b.find(2));
                 b.delete(2);
                                  b.display(b.root);





                 
             }
     
}
