public class HW4 {
    public static void main(String[] args) {

        {
            double sum=1;
            double a = 1000;
            int i;
            for (i = 1; i <= 3; i++)
            {
                a = a + (0.05 * 1000);
                System.out.println("The" + (i) + "year=" + a);
            }
            for( i=0;i<=3;i++)
                 sum=a+i;
            System.out.println(sum);
        }


    }
}
