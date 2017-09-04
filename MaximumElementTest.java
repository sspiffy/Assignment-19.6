import org.junit.Assert;
import org.junit.Test;



public class MaximumElementTest
{

    @Test
    public void maxElementInteger()
    {
        Integer[][] IntegerArray = {{3,4,9},{8,2,6}};
        int maximumExpectedInteger = 9;
        int maximumCalculatedInteger = MaximumElement2DArray.max(IntegerArray);
        Assert.assertEquals(maximumExpectedInteger, maximumCalculatedInteger);
    }

    @Test
    public void maxElementDouble()
    {
        Double[][] DoubleArray = {{3.0, 4.9, 9.0, 3.9},{6.9, 3.2, 6.0, 7.7}};
        double maximumExpectedDouble = 9.0;
        double maximumCalculatedDouble= MaximumElement2DArray.max(DoubleArray);
        Assert.assertEquals(maximumExpectedDouble, maximumCalculatedDouble, 0.0);
    }

}
