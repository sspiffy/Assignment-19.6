public class MaximumElement2DArray
{
    public static void main (String[] args)
    {
        Integer[][] twoDimensionalArray = {{1,4,6},{4,3,9}};
        System.out.println("Maximum element in a two dimensional array is " + max(twoDimensionalArray));
    }

    public static <E extends Comparable<E>> E max(E[][] list)
    {
        E max = list[0][0]; //set maximum element to the first array element

        for (int i = 0; i < list.length; i++) //run through all elements in both arrays
        {
            for (int j = 0; j < list[i].length; j++)
            {
                if(max.compareTo(list[i][j]) < 0) //compareTo returns 0 if equal to argument, 1 if larger, -1 if less
                {
                    max = list[i][j]; //update max
                }
            }
        }
        return max;
    }
}
