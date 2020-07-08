package offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* 从上往下打印出二叉树的每个结点，同一层的结点按照从左到右的顺序打印
 */
public class LayerBinaryTree {

    public  static List<Object> getListResult(BinaryTreeNode binaryTreeNode) {

        List<Object> result = new LinkedList<>();
        if (binaryTreeNode == null) {
            return null;
        }
        Queue<BinaryTreeNode> queue = new LinkedList();
        queue.add(binaryTreeNode);
        while (!queue.isEmpty()) {

            BinaryTreeNode b = (BinaryTreeNode) queue.poll();
            result.add(b.getData());
            if (b.getLchildNode() != null) {
                queue.add(b.getLchildNode());
            }
            if (b.getRchildNode() != null) {
                queue.add(b.getRchildNode());
            }
        }

        return result;

    }

    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(8);
        BinaryTreeNode node2 = new BinaryTreeNode(6);
        BinaryTreeNode node3 = new BinaryTreeNode(10);
        BinaryTreeNode node4 = new BinaryTreeNode(5);
        BinaryTreeNode node5 = new BinaryTreeNode(7);
        BinaryTreeNode node6 = new BinaryTreeNode(9);
        BinaryTreeNode node7 = new BinaryTreeNode(11);
        node1.setLchildNode(node2);
        node1.setRchildNode(node3);
        node2.setLchildNode(node4);
        node2.setRchildNode(node5);
        node3.setLchildNode(node6);
        node3.setRchildNode(node7);

        LayerBinaryTree.getListResult(node1);
    }
}
