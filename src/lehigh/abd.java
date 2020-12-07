package lehigh;

public class abd {
    void BubbleSort(int R[], int n) {
        int i, j, temp, flag;
        for (i = n - 1; i >= 1; i--)    //共需要进行n-1次冒泡过程
        {
            flag = 0;    //标识此次冒泡过程是否发生元素交换
            for (j = 1; j <= i; ++j)    //较小元素前移
            {
                if (R[j - 1] > R[j]) {
                    temp = R[j];
                    R[j] = R[j - 1];
                    R[j - 1] = temp;
                }
            }
            if (flag == 0)    //排序完成
            {
                return;
            }
        }
    }
}
