package net.xgh.cheer.demo.ch02;

public class Test3 {
	public static void main(String[]ags){
		Dag a=new Dag("旺财","公",10);
	a.play();
	}

}
abstract class pet
{
	String name;
	String sex;
	int age;
	public abstract void play();
	
}
class Dag extends pet
{
	public Dag(String name,String sex,int age)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
		
	}
	public void play()
		{
		    System.out.print("名字:"+name+"\n"+"性别"+sex+"\n"+"年龄"+age);
			System.out.print("我是一个好人"); 
		}
	}
