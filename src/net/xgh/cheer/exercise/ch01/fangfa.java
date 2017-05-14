package net.xgh.cheer.exercise.ch01;

public class fangfa {
	public void play(String str) {
		String petNsme = str;
		if (str == "cat") {
			System.out.println(str + "抓老鼠");
		} else if (str == "dog") {
			System.out.println(str = "玩飞盘");
		}
	}

	public static void main(String[] args) {
		fangfa pet = new fangfa();
		pet.play("cat");
	}

}
