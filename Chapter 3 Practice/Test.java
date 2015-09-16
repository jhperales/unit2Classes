import Coin.java;
public class Test
{
    public static void main(String [] args)
    {
        Coin coin = new Coin();
        coin.flip();
        String result = coin.toString();
        System.out.prinln(result);
    }
}
        