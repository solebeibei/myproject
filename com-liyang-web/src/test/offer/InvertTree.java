package offer;

public class InvertTree {
    public static  BinaryTreeNode invertTree(BinaryTreeNode root) {

        if (root==null)
            return  null;

        if (root.getLchildNode()==null&&root.getRchildNode()==null){
            return  root;
        }

        invertTree(root.getLchildNode());
        invertTree(root.getRchildNode());

        BinaryTreeNode temp=root.getLchildNode();
        root.setLchildNode(root.getRchildNode());
        root.setRchildNode(temp);
        return  root;

    }

    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(8);
//        BinaryTreeNode node2 = new BinaryTreeNode(6);
//        BinaryTreeNode node3 = new BinaryTreeNode(10);
//        BinaryTreeNode node4 = new BinaryTreeNode(5);
//        BinaryTreeNode node5 = new BinaryTreeNode(7);
//        BinaryTreeNode node6 = new BinaryTreeNode(9);
//        BinaryTreeNode node7 = new BinaryTreeNode(11);
//        node1.setLchildNode(node2);
//        node1.setRchildNode(node3);
//        node2.setLchildNode(node4);
//        node2.setRchildNode(node5);
//        node3.setLchildNode(node6);
//        node3.setRchildNode(node7);


      BinaryTreeNode treeNode=  invertTree(node1);

        System.out.println(treeNode.getData());

    }
}
