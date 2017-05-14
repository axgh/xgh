package net.xgh.cheer.smaple.ch03;
import java.util.Scanner;
public class ifelse {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("输入:");
		int age=sc.nextInt();
		if(age>=60){
		System.out.println("老年人");
		}else if(age>=40&&age<60){
		System.out.println("中年人");
		}else if(age>=20&&age<40)
		{System.out.println("青年人");
		}else 
	    {System.out.println("儿童");

	    }	
	}
	}