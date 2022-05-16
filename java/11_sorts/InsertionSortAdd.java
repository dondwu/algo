package sorts;

import java.util.Arrays;

/**
 * 插入排序（插入位置，从头至尾搜索）
 *
 * @Author： ooooor
 */
public class InsertionSortAdd {

    public static void main(String[] args) {
        int[] data = new int[]{4, 6, 5, 3, 7, 1, 2};
        fromStartToEnd(Arrays.copyOf(data, data.length));
        System.out.println(Arrays.toString(data));
    }

    /**
     * 查询插入位置时， 从头至尾搜索
     *
     * @param data
     */
    private static void fromStartToEnd(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int value = data[i];

            int[] tmp = new int[2];
            int change = i;
            for (int j = 0; j < i; j++) {
                if (value >= data[j]) {
                    continue;
                }

                int index = j % 2;
                if (change == i) {
                    tmp[Math.abs(index - 1)] = data[j];
                    change = j;
                }
                tmp[index] = data[j + 1];
                if (0 == index) {
                    data[j + 1] = tmp[index + 1];
                } else {
                    data[j + 1] = tmp[index - 1];
                }
            }
            data[change] = value;
        }
    }

    /**
     * 插入排序, 从小到大
     */
    private static void insertionSort(int[] a, int n) {
        if (n < 2) {
            return;
        }

        for (int i = 1; i < n; i++) {
            int value = a[i];

            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j] = value;
        }
    }

    /**
     * 插入排序，from geektime
     */
    public void insertSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }


}
