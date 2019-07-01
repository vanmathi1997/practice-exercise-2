public class FactorialInt {

    public static long printFactorial(Long value)
    {
        long fact=1;
        for(int i=1;i<=value;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

}
