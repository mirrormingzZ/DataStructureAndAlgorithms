package SegmentTree;

import Array.Array;

import java.util.Arrays;

/**
 * @program: DataStructureAndAlgorithms
 * @description: 线段树
 * @author: mirrorming
 * @create: 2019-01-11 16:52
 **/

public class SegmentTree<E> {
    private E[] tree;
    private E[] data;

    public SegmentTree(E[] arr) {
        data = (E[]) new Object[arr.length];
        for (int i = 0; i < arr.length; i++)
            data[i] = arr[i];

        tree = (E[]) new Object[4 * data.length];
    }

    public int getSize() {
        return data.length;
    }

    public E get(int index) {
        if (index < 0 || index >= data.length)
            throw new IllegalArgumentException("index is illegal~");
        return data[index];
    }

    /**
     * @Description: 返回完全二叉树的数组表示中, 一个索引所表示的元素的左孩子节点的索引
     * @Param: [index]
     * @return: int
     */
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    /**
     * @Description: 返回完全二叉树的数组表示中, 一个索引所表示的元素的右孩子节点的索引
     * @Param: [index]
     * @return: int
     */
    private int rightChild(int index) {
        return 2 * index + 2;
    }
}