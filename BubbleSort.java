class BubbleSort
{
    private static boolean more(int value1, int value2) // return true if value1 is grater than value2
    {
        return value1 > value2;
    }

    public static void sort(int array[])
    {
        int size = array.length;
        int i,j,temp;

        for(i=0; i<(size-1); i++) // this loop is for the number of swaps that are done
        {
            for(j=0; j<size-i-1; j++) // this loop is used to do comparison of data values
            {
                if(more(array[j], array[j+1])) // if value of array[j] is grater than array[j+1]
                {
                    //swapping
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    // Driver method
    public static void main(String args[])
    {
        int[] array = {9,1,8,2,7,3,6,4,5};
        BubbleSort.sort(array);

        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
            
        }
    }


}