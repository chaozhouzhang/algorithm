package me.chaozhouzhang.algorithm.tree;

/**
 * Created on 2019/1/15 19:31
 *
 * @author zhangchaozhou
 */
public class Tree {

    private Node root;


    /**
     * @param key
     * @return
     */
    public Node find(int key) {
        Node current = root;
        while (current.getiData() != key) {
            if (key < current.getiData()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }


    /**
     * @param id
     * @param dd
     */
    public void insert(int id, double dd) {
        Node node = new Node();
        node.setiData(id);
        node.setfData(dd);
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.getiData()) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(node);
                        return;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(node);
                        return;
                    }
                }
            }
        }
    }


    /**
     *
     * @param localRoot
     */
    public void inOrder(Node localRoot){
        if (localRoot!=null){
            inOrder(localRoot.getLeftChild());
            System.out.println(localRoot.getiData());
            inOrder(localRoot.getRightChild());
        }
    }


    /**
     *
     * @return
     */
    public Node minium(){
        Node current,last = null;
        current=root;
        while (current!=null){
            last= current;
            current = current.getLeftChild();
        }
        return last;
    }


    /**
     * 删除
     * @param key
     * @return
     */
    public boolean delete(int key){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.getiData()!=key){
            parent= current;
            if (key<current.getiData()){
                isLeftChild= true;
                current = current.getLeftChild();
            }else {
                isLeftChild= false;
                current= current.getRightChild();
            }

            if (current==null){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

    }

}
