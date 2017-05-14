package net.xgh.cheer.exercise.ch01;

import java.util.Scanner;

public class huangou {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入消费金额:");
		double a=sc.nextDouble();
		if(a>=50)
		{
		
			System.out.println("1.满足50元，加2元换购百事可乐1瓶");
			System.out.println("2.满足100元，加3元换购500ml百事可乐1瓶");
			System.out.println("3.满足100元，加10元换购一袋5公斤面粉");
			System.out.println("4.满足200元，加20元换购一个苏泊尔炒菜锅");
			System.out.println("5.满足500元，加20元换购一瓶欧莱雅爽肤水");
			
			System.out.println("请选择换购条件:");
			int b= sc.nextInt();
			switch (b)
			{
			case 1:
			if(a>=50)
			{System.out.println("消费金额是:"+(a+2));
			System.out.println("换购成功，一瓶百事可乐.");
			}
		
		break;
			case 2:
				if(a>=100)
				{System.out.println("消费金额是:"+(a+3));
				System.out.println("换购成功，500ml百事可乐.");
				}
		break;
			case 3:
				if(a>=100)
				{System.out.println("消费金额是:"+(a+10));
				System.out.println("换购成功，一袋5公斤面粉.");
				}
				break;
			case 4:
				if(a>=200)
				{System.out.println("消费金额是:"+(a+20));
				System.out.println("换购成功，一个苏泊尔炒菜锅.");
				}
                break;
			case 5:
				if(a>=500)
				{System.out.println("消费金额是:"+(a+20));
				System.out.println("换购成功，一瓶欧莱雅爽肤水.");
				}
				break;
			case 0:
			{System.out.println("不换购");
			break;
			}
			}
}else{
	System.out.println("消费金额是不满足50元时，不参加活动！");
	System.out.println("消费总额是："+a);
}
}}