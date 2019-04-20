package me.chaozhouzhang.algorithm.array;

/**
 * Created on 2019/1/13 18:00
 * 数组的局限性分析：
 * 　　①、插入快，对于无序数组，上面我们实现的数组就是无序的，即元素没有按照从大到小或者某个特定的顺序排列，只是按照插入的顺序排列。无序数组增加一个元素很简单，只需要在数组末尾添加元素即可，但是有序数组却不一定了，它需要在指定的位置插入。
 * 　　②、查找慢，当然如果根据下标来查找是很快的。但是通常我们都是根据元素值来查找，给定一个元素值，对于无序数组，我们需要从数组第一个元素开始遍历，直到找到那个元素。有序数组通过特定的算法查找的速度会比无需数组快，后面我们会讲各种排序算法。
 * 　　③、删除慢，根据元素值删除，我们要先找到该元素所处的位置，然后将元素后面的值整体向前面移动一个位置。也需要比较多的时间。
 * 　　④、数组一旦创建后，大小就固定了，不能动态扩展数组的元素个数。如果初始化你给一个很大的数组大小，那会白白浪费内存空间，如果给小了，后面数据个数增加了又添加不进去了。
 * 　　很显然，数组虽然插入快，但是查找和删除都比较慢，而且扩展性差，所以我们一般不会用数组来存储数据，那有没有什么数据结构插入、查找、删除都很快，而且还能动态扩展存储个数大小呢，答案是有的，但是这是建立在很复杂的算法基础上。
 *
 * @author zhangchaozhou
 */
public class ArrayTest {


    private int[] intArray;
    private int real;
    private int max;


    public ArrayTest(int max) {
        this.real = 0;
        this.max = max;
        this.intArray = new int[max];
    }


    /**
     * 获取数组的真实有效长度
     *
     * @return
     */
    public int getReal() {
        return real;
    }


    public void display() {
        for (int index = 0; index < real; index++) {
            System.out.println(intArray[index]);
        }
    }

    /**
     * 往数组中增加一条数据
     *
     * @param value 假设操作人是不会添加重复元素的，如果有重复元素对于后面的操作都会有影响。
     * @return 添加成功返回true，添加的元素超过范围了返回false。
     */
    public boolean add(int value) {
        if (real == max) {
            return false;
        }
        intArray[real] = value;
        real++;
        return true;
    }


    /**
     * 根据下标获取数组中的元素
     *
     * @return 查找下标值在数组下标有效范围内，返回下标所表示的元素；查找下标超出数组下标有效值，提示访问下标越界。
     */
    public int get(int index) {
        if (index < 0 || index > real) {
            System.out.println("访问下标越界");
        }
        return intArray[index];
    }


    /**
     * 从数组中查找元素
     *
     * @param value
     * @return 查找的元素如果存在则返回下标值，如果不存在，返回 -1
     */
    public int find(int value) {
        for (int i = 0; i < real; i++) {
            if (intArray[i] == value) {
                return i;
            }
        }
        return -1;
    }


    /**
     * 修改数组中的元素
     *
     * @param oldValue
     * @param newValue
     * @return 修改成功返回true，修改失败返回false。
     */
    public boolean modify(int oldValue, int newValue) {
        int target = find(oldValue);
        if (target == -1) {
            return false;
        }
        intArray[target] = newValue;
        return true;
    }

    /**
     * 从数组中删除元素
     *
     * @return 如果要删除的值不存在，直接返回 false;否则返回true，删除成功
     */
    public boolean delete(int value) {

        int target = find(value);
        if (target == -1) {
            return false;
        }

        //TODO 开始删除操作
        if (target == real - 1) {
            real--;
        } else {
            for (int index = target; index < real - 1; index++) {
                intArray[index] = intArray[index + 1];
            }
            real--;
        }
        return true;
    }

    public static void main(String[] args) {


        ArrayTest arrayTest = new ArrayTest(4);
        arrayTest.add(1);
        arrayTest.add(2);
        arrayTest.add(3);
        arrayTest.add(4);
        arrayTest.display();
        System.out.println(arrayTest.get(0));
        arrayTest.delete(4);
        arrayTest.modify(3, 33);
        arrayTest.display();
    }


}
