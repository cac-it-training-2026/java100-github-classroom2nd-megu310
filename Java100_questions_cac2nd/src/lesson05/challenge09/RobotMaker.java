/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題9  あとかたづけロボットの追加
 *
 * 引数として渡された食材を
 * 0でクリアするクラスを作成します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  あとかたづけをしてくれるロボットも欲しいところですね。
 *
 *  G博士：
 *  そうれはもう作ってあるぞ。
 *
 *  Rさん：
 *  えっ！どうやって使うんですか？
 *
 *  G博士：
 *  今まで使ってきた材料を一つにまとめて渡すときれいにしてくれるんじゃ。
 *
 *  Rさん：
 *  早速やってみます。
 *
 *  小麦粉の量を入力してください（グラム）＞○
 *
 *  砂糖の量を入力してください（グラム）＞○
 *
 *  卵の個数を入力してください＞○
 *
 *  バターの量を入力してください（グラム）＞○
 *
 *  【※調理できる料理】が出来ました。
 *
 *  あとかたづけをします。
 *
 *  小麦粉  ：0g
 *  砂糖    ：0g
 *  卵      ：0個
 *  バター  ：0g
 *
 *  きれいになりました。
 *
 */

package lesson05.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//ここに問題8で作成したクラス(変更なし)を記述してください。

//ここに次の条件を満たすクラスを作成してください。
//クラス名：ClearRobot
//メソッド名：clearTable(引数int[] ingredients
//戻り値void、渡された配列を0でクリアする)

class Robot {
	int energy;
	int water;
	String name;

	void pumpWater() {
		System.out.println("水を" + water + "リットル出します。\n");
	}

	void randomWater() {
		water = (int) (Math.random() * 10) % 9 + 1;
	}

	void setWater(int water) {
		this.water = water;
	}

	void makeOmelet(int eggNum, int butterNum) {
		int bestOmeletNum1 = eggNum / 2;
		int bestOmeletNum2 = butterNum / 5;

		if (bestOmeletNum1 > bestOmeletNum2) {
			System.out.println("\n" + bestOmeletNum2 + "人分のオムレツを作成しました。\n");
		} else {
			System.out.println("\n" + bestOmeletNum1 + "人分のオムレツを作成しました。\n");
		}
	}

	int getWater() {
		return water;
	}

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {
		int flour = flourNum - 170;
		int sugar = sugarNum - 50;
		int egg = eggNum - 2;
		int butter = butterNum - 80;

		String menu = null;
		if ((flour >= 0) && (sugar >= 0) && (egg >= -1) && (butter >= 0)) {
			menu = "クッキー";
		} else if ((egg >= 0) && (butter >= -75)) {
			menu = "オムレツ";
		} else {
			menu = "ゆで卵";
		}
		return menu;
	}
}

//クラスClearRobotの宣言
//clearTableメソッド　渡された配列を0でクリアする
class ClearRobot {
	void clearTable(int[] ingredients) {
		Arrays.fill(ingredients, 0);
	}
}

public class RobotMaker {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("あとかたづけをしてくれるロボットも欲しいところですね。\n");
		System.out.println("G博士：");
		System.out.println("そうれはもう作ってあるぞ。\n");
		System.out.println("Rさん：");
		System.out.println("えっ！どうやって使うんですか？\n");
		System.out.println("G博士：");
		System.out.println("今まで使ってきた材料をまとめて、料理と一緒に渡すときれいにしてくれるんじゃ。\n");
		System.out.println("Rさん：");
		System.out.println("早速やってみます。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\n砂糖の量を入力してください（グラム）＞");
		String sugarNumStr = br.readLine();
		int sugarNum = Integer.parseInt(sugarNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//makeEggDishesを実行する。
		//標準出力でメニューを表示する。
		Robot robot = new Robot();
		String menu = robot.makeEggDishes(flourNum, sugarNum, eggNum, butterNum);
		System.out.println(menu + "が出来ました。");

		System.out.println("\nあとかたづけをします。\n");
		int[] ingredients = new int[4];
		ingredients[0] = flourNum;
		ingredients[1] = sugarNum;
		ingredients[2] = eggNum;
		ingredients[3] = butterNum;

		//ここでClearRobotクラスのインスタンスを作り、
		//（インスタンス名はclearRobot）
		//clearTableを実行する。
		ClearRobot clearRobot = new ClearRobot();
		clearRobot.clearTable(ingredients);

		System.out.println("小麦粉  ：" + ingredients[0] + "g");
		System.out.println("砂糖    ：" + ingredients[1] + "g");
		System.out.println("卵      ：" + ingredients[2] + "個");
		System.out.println("バター  ：" + ingredients[3] + "g");

		System.out.println("\nきれいになりました。");
	}

}
