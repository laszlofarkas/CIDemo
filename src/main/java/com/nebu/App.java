package com.nebu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! " + add(3, 5));
    }

    /**
     * Add two integer
     * @param a first integer
     * @param b second integer
     * @return result of addition
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
