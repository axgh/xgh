package net.xgh.cheer.demo.ch01;

public class Test2 {
	public static void main(String[]args){
	Dogs d = new Dogs("旺财","公",100,"0","中华田园犬");
	d.play();
	System.out.println("*****************");
	Cats c= new Cats();
	c.name ="旺财";
    c.love="0";		
	c.helth=100;
	c.pinzhong="中华田园犬";
	c.sex="公";
	c.play();
	}
    }
    class Pets
    {
		String name;
		String love;		
		int helth;
		String pinzhong;
		String sex;
		public void play()
		{System.out.println("名字："+name+"\n"+"性别："+sex+"\n"+"健康值："+helth+"\n"+"亲密度："+love+"\n"+"品种："+pinzhong);
	}
    }
    
	class Dogs extends Pets
	{
		public Dogs (String name,String sex,int helth,String love,String pinzhong)
		{
			
			this.name=name;
			this.sex=sex;
		    this.love=love;
			this.helth=helth;
			this.pinzhong=pinzhong;
			
	}
		public void play()
		{
			super.play();
			System.out.println("我是一只中华田园犬");
	}
	}
	class Cats extends Pets
	{
	}
				