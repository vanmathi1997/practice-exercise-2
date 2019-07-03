public class FactorialInt {

    public static long printFactorial(Long value)
    {
        long fact=1;
        for(int i=1;i<=value;i++)//find the factorial
        {
            fact=fact*i;
        }
        return fact;//returns the result
    }

}
