public class Main {
    public static void main(String[] args)
    {
        for(int cnt = 0; cnt <= 30; cnt++) // cnt = cnt + 1 -> cnt++
        {
            System.out.println(cnt);
        }

        System.out.println("\nNew Loop: ");


        for(int cnt = 30; cnt >= 0; cnt--)
        {
            System.out.println(cnt);
        }
        System.out.println("\nNew Loop: ");


        for(int cnt = 0; cnt <= 18; cnt+=3)
        {
            System.out.println(cnt);
        }

        System.out.println("\nNew Loop: ");


        for(int cnt = 10; cnt >= 0; cnt-=2)
        {
            System.out.println(cnt);
        }

    }
}