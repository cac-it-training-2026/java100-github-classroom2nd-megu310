package lesson09.challenge02.Nurserry.logic;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void divide(int cakes, int childs) {

		//ここに適切な処理を記述
		try {
			int num = cakes / childs;

			System.out.println("\n1人" + num + "個になります。");

		} catch (ArithmeticException e) {
			System.out.println("\nケーキを食べる園児がいません。");
		}

	}
}
