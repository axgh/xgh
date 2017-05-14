package net.aaa.cheer.demo.ch01;

public class test1 {
	public static void main(String[]args){
	Dog d = new Dog();
	d.play();
	System.out.println("*****************");
	Cat a= new Cat();
	
	a.play();
	}
    }
    class Pet
    {
		String name;
		String love;		
		int helth;
		String pinzhong;
		String sex;
	}
	class Dog
	{
		public void play()
		{
			Pet p = new Pet();
			p.name="旺财";
			p.sex="公";
			p.love="100";
			p.helth=100;
		    p.pinzhong="中华田园犬";
			System.out.println("名字："+p.name+"\n"+"性别："+p.sex+"\n"+"健康值："+p.helth+"\n"+"亲密度："+p.love+"\n"+"品种："+p.pinzhong);
	}
	}
			class Cat
			{
				public void play()
				{
					Pet p = new Pet();
					p.name="猫";
					p.sex = "Q妹";
					p.love="100";
					p.helth=100;
				    p.pinzhong="猫";
				    System.out.println("名字："+p.name+"\n"+"性别："+p.sex+"\n"+"健康值："+p.helth+"\n"+"亲密度："+p.love+"\n"+"品种："+p.pinzhong);
				}
					
}
	