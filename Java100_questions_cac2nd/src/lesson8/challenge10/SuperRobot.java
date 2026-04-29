package lesson8.challenge10;

public class SuperRobot {
	String name;

	//引数でもらった名前を、このロボ自身の名前として保存
	public SuperRobot(String name) {
		this.name = name;
	}

	public void cookOnicha(String[] ingredients) {
		//材料があるかどうかのフラグ
		boolean hasBarley = false;
		boolean hasWater = false;

		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals("大麦")) {
				hasBarley = true;
			} else if (ingredients[i].equals("水")) {
				hasWater = true;
			}
		}

		if (hasBarley && hasWater) {
			System.out.println(name + "がヒカキンさんも驚く、ONITYA風の麦茶を作ります！");
			System.out.println("大麦を香ばしく煮出して、すっきりとした麦茶に仕上げました。");
		} else {
			System.out.println("材料が足りないので、ONITYA風の麦茶を作れません。");
			if (!hasBarley) {
				System.out.println("不足：大麦");
			}
			if (!hasWater) {
				System.out.println("不足：水");
			}
		}
	}

	public static void main(String[] args) {
		//オブジェクト生成→コンストラクタを呼び出す→"スーパー調理ロボ"がnameに入る
		SuperRobot robot = new SuperRobot("スーパー調理ロボ");
		//材料の配列を用意！
		String[] ingredients = { "大麦", "水" };
		robot.cookOnicha(ingredients);
	}
}
