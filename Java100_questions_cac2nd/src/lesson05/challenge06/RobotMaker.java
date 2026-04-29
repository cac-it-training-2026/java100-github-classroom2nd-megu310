/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題6  材料を入力する
 *
 * 複数の引数を元に出力内容を変えるメソッドを追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  G博士：
 *  いよいよ第2段階に突入じゃ。調理が出来るようにするぞ！
 *
 *  Rさん：
 *  実質第1段階ですね。
 *
 *  G博士：
 *  まずはオムレツを作る機能を実装してみた。
 *
 *  Rさん：
 *  いいですね。僕オムレツ大好きです。
 *
 *  G博士：
 *  卵2個、バター5gで1人前を作る。材料を増やすとその人数分作ってくれるぞ。
 *
 *  卵の個数を入力してください＞○
 *
 *  バターの量を入力してください（グラム）＞○
 *
 *  【※ここにオムレツの個数を出力】人分のオムレツを作成しました。
 *
 *  Rさん：
 *  わー、博士すごいですね！味もなかなか。
 *
 *  G博士：
 *  じゃろ。死んだ婆さんの秘伝のレシピを入れておいたからの。
 *
 */

package lesson05.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここに問題5で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：makeOmelet(引数int eggNum ,int butterNum、戻り値void、
//入力されて材料の個数に併せてオムレツの個数を表示する)
class Robot {
	int energy;
	int water;
	String name;

	void pumpWater() {
		System.out.println("\n水を" + water + "リットル出します。\n");

	}

	void randomWater() {
		water = (int) (Math.random() * 10) % 9 + 1;
	}

	void setWater(int water) {
		this.water = water;
	}

	void makeOmelet(int eggNum, int butterNum) {
		//入力された卵の数から作れるオムレツの数
		int bestOmeletNum1 = eggNum / 2;
		//入力されたバターの数から作れるオムレツの数
		int bestOmeletNum2 = butterNum / 5;

		if (bestOmeletNum1 > bestOmeletNum2) {
			System.out.println("\n" + bestOmeletNum2 + "人分のオムレツを作成しました。\n");
		} else {
			System.out.println("\n" + bestOmeletNum1 + "人分のオムレツを作成しました。\n");
		}
	}
}

public class RobotMaker {

	public static void main(String[] args) throws IOException {

		System.out.println("G博士：");
		System.out.println("いよいよ第2段階に突入じゃ。調理が出来るようにするぞ！\n");
		System.out.println("Rさん：");
		System.out.println("実質第1段階ですね。\n");
		System.out.println("G博士：");
		System.out.println("まずはオムレツを作る機能を実装してみた。\n");
		System.out.println("Rさん：");
		System.out.println("いいですね。僕オムレツ大好きです。\n");
		System.out.println("G博士：");
		System.out.println("卵2個、バター5gで1人前を作る。材料を増やすとその人数分作ってくれるぞ。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//makeOmeletを実行する。
		Robot robot = new Robot();
		robot.makeOmelet(eggNum, butterNum);

		System.out.println("Rさん：");
		System.out.println("わー、博士すごいですね！味もなかなか。\n");
		System.out.println("G博士：");
		System.out.println("じゃろ。死んだ婆さんの秘伝のレシピを入れておいたからの。\n");
	}

}
