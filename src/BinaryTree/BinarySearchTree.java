package BinaryTree;

//Time Complexity to find an element is O(log n)
//Stores data in sorted order
public class BinarySearchTree {

    class Node{
        int value;
        Node right;
        Node left;

        public Node(int value){
            this.value=value;
        }
    }

    Node root=null;

    public void insert(int value){
        root= insertNode(root,value);
    }


    public Node insertNode(Node root, int value){

        //if root is null then insert the node directly
        if(root == null) {
            root = new Node(value);
            return root;
        }

        //if the value is lesser than the root node value then traverse the left side of tree
        if(value < root.value ){
            root.left=insertNode(root.left,value);
        }
        //if the value is greater than the root node value then traverse the right side of tree
        else if(value> root.value){
            root.right=insertNode(root.right,value);
        }
        return root;

    }

    public void sortedOrder(){
        inorderTraverse(root);
    }


    public void inorderTraverse(Node root){
        if(root != null){
            //As we print from left side of tree we should goto left most element
            inorderTraverse(root.left);

            //Print the left most element
            System.out.println(root.value);

            //Traverse to right side of sub-tree
            inorderTraverse(root.right);

        }
    }

    public int getMinimum(Node root){

        Node current=root;

        while (current.left!=null){
            current=current.left;
        }
        return current.value;
    }

    public int getMinimumElement(){
        return getMinimum(root);
    }

    public int getMaximum(Node root){
        Node current=root;
        while (current.right!=null){
            current=current.right;
        }
        return current.value;
    }

    public int getMaximumElement(){
        return getMaximum(root);
    }

    public int getHeightOfTree(Node root){
        if (root==null)
            return -1;

        //Keep on iterating for all the subtree's starting from left bottom
        //Add 1 to calculate the height as root itself is a part of height
        return 1 + Math.max(getHeightOfTree(root.left),getHeightOfTree(root.right));
    }

    public int getHeight(){
        return getHeightOfTree(root);
    }


    public boolean searchAnElement(Node root,int value){
        //if root is null then return false
        if(root == null)
            return false;

        //if the element is found then return true
        if(root.value == value)
            return true;

        //if the value is less than root.value then search on left side of tree
        if(value < root.value)
            return searchAnElement(root.left,value);
        //if the value is greater than root.value then search on right side of tree
        else
            return searchAnElement(root.right,value);

    }

    public boolean search(int value){
        return searchAnElement(root,value);
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        //Insert the Element in Binary Search Tree
        bst.insert(20);
        bst.insert(23);
        bst.insert(45);
        bst.insert(10);

        //Print the Tree
        bst.sortedOrder();

        //Get Minimum element
        System.out.println("Minimum element is: "+bst.getMinimumElement());

        //Get Maximum element
        System.out.println("Maximum element is: "+bst.getMaximumElement());

        //Get height of tree
        System.out.println("Height of Tree is: "+bst.getHeight());

        //Search for an element
        int valueToSearch=98;
        System.out.println("Element "+valueToSearch+" is present: "+bst.search(valueToSearch));

    }




}
