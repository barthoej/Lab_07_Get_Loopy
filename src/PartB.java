public class PartB {
    public static void main(String[] args)
    {
        //Nested for loop
        for(int row=1; row <=5; row++)
        {
            for(int column=1; column <= row; column++)
                System.out.printf("%1s","*" );

            System.out.println();
        }



        //Nested for loop
        for(int row=5; row >= 1; row--)
        {
            for(int column=1; column <= row; column++)
                System.out.printf("%1s","*" );

            System.out.println();
        }



        //Nested for loop
        for(int row=1; row <=5; row++)
        {
            for(int column=1; column <= 5; column++)
                System.out.printf("%1s","*" );

            System.out.println();
        }
    }
}
