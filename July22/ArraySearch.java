public class ArraySearch {
    public static int search(int[] arr, int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int[] arr = { 2,3,4,5,6,10,7,8,9 };
        int x = 1;
        int result = search(arr, x);
        if (result== 0)
            System.out.print("Element is not in array");
        else
            System.out.print("Element is at index " + result);
    }
}
