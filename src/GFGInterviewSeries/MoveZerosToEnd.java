package GFGInterviewSeries;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int a[] = new int[] {3, 1, 0, 2, 0, 6, 0,4};
        reorder(a);
        for (Integer i : a)
            System.out.print(i + " ");
    }

    // Move all non-zeros to zero's place and at end add remaining zeros at the end of the array till size 'n'
    static void reorder(int A[])
    {
        // k stores index of next available position
        int k = 0;
        int n = A.length;

        // do for each element
        for (int i = 0; i < n; i++)
        {
            // if current element is non-zero, put the element at
            // next free position in the array
            if (A[i] != 0)
                A[k++] = A[i];
        }

        // move all 0's to the end of the array (remaining indices)
        for (int i = k; i < n; i++)
            A[i] = 0;
    }

}
