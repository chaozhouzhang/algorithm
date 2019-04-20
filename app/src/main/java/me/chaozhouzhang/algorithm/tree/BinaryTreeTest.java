package me.chaozhouzhang.algorithm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 2019/1/14 19:22
 * <p>
 * 既能像链表医院快速的插入和删除，也能像有序数组医院快速的查找。
 * <p>
 * <p>
 * <p>
 * <p>
 * 树：由边连接的节点构成，圆为节点，直线为边。
 * <p>
 * 二叉树：每个节点最多有两个子节点。
 *
 * @author zhangchaozhou
 */
public class BinaryTreeTest {


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String[] strings = list2Strings(stringList);
        for (String s : strings) {
            System.out.println(s);
        }
        List<String> stringList1 = strings2List(strings);
        for (String s : stringList1) {
            System.out.println(s);
        }
    }


    /**
     * List<String> 转 String[]
     *
     * @param stringList
     * @return
     */
    public static String[] list2Strings(List<String> stringList) {
        if (stringList == null) {
            return null;
        }
        String[] strings = stringList.toArray(new String[stringList.size()]);
        return strings;
    }

    /**
     * String[] 转 List<String>
     *
     * @param strings
     * @return
     */
    public static List<String> strings2List(String[] strings) {
        if (strings == null) {
            return null;
        }
        List<String> stringList = Arrays.asList(strings);
        return stringList;
    }
}
