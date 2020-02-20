public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {4, 6, 7, 9, 8, 1, 3, 2, 5, 10};
        printArr(arr);
        printArr(insertion(arr));
    }

    public static void printArr(int[] arr)
    {
        String print = "";
        for(int i = 0; i < arr.length; i++)
        {
            print = print + arr[i] + " ";
        }
        System.out.println(print);
    }

    public static int[] insertion(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int j = i-1;
            while(j != 0 || arr[i] < arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        printArr
        return arr;
    }
}