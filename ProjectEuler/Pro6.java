public class Pro6
  {

    public static void main(String[] args)
    {
      int sum = 0;
      int sum2 = 0;
      for(int i = 0; i<= 100; i++)
        {
          sum += i*i;
        }
      for(int i = 0; i<= 100; i++)
        {
          sum2 += i;
        }
      sum2 = sum2 * sum2;
      System.out.println(sum2 - sum);
    }


    
  }