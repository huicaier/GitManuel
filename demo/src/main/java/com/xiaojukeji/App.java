package com.xiaojukeji;

import com.xiaojukeji.annotation.MyHouse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MyHouse myHouse = new MyHouse();
        myHouse.open();
    }
}
