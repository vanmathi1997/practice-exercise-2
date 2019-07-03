public class CheckPower {
    public static boolean isPower4(Long input){
        if(input == 0)
            return false;
        while(input != 1)//condition to check the given number is power of 4
        {
            if(input % 4 != 0)
                return false;
            input/= 4;
        }
        return true;

    }
}
