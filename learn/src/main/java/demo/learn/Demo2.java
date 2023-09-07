package demo.learn;

import java.sql.Date;

public class Demo2 

{
public static void main(String[] args)
{
	Date D1=new Date(0);
	System.out.println(D1.toString());
	long currentTimeMillis = System.currentTimeMillis();
    Date date = new Date(currentTimeMillis);
    System.out.println(date.toString());
	
}
}
