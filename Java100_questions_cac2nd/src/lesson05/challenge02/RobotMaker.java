/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題2  ロボットを増やす
 *
 * 試作第１号が成功したので、
 * 同種のロボットを３体作ることになりました。
 * 今度はそれぞれに名前を付けられるようにします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  G博士：
 *  ようし試作機がうまく行ったから増やすぞ！
 *
 *  Rさん：
 *  何体つくりますか？
 *
 *  G博士：
 *  3体じゃ。それぞれ「RF1」「RF2」「RF3」と名付ける！
 *
 *  Rさん：
 *  安易ですね。
 *
 *  G博士：
 *  なんか言ったか？
 *
 *  Rさん：
 *  いえ、何にも......はい、3体作って名前を付けましたよ。
 *
 *  G博士：
 *  よし、では確認にため2番目のロボットの中を覗いてみよう。
 *
 * 【※ここに2番目のロボットの名前を出力】
 *
 *  G博士：
 *  OKじゃ。
 *
 */

package lesson05.challenge02;

//ここに問題1で作成したクラスに次の条件を足したクラスを作成してください。
//フィールド名：name(String型)
class Robot {
	int energy;
	String name;
}

public class RobotMaker {

	public static void main(String[] args) {

		System.out.println("G博士：");
		System.out.println("ようし試作機がうまく行ったから増やすぞ！\n");
		System.out.println("Rさん：");
		System.out.println("何体つくりますか？\n");
		System.out.println("G博士：");
		System.out.println("3体じゃ。それぞれ「RF1」「RF2」「RF3」と名付ける！\n");
		System.out.println("Rさん：");
		System.out.println("安易ですね。\n");
		System.out.println("G博士：");
		System.out.println("なんか言ったか？\n");
		System.out.println("Rさん：");
		System.out.println("いえ、何にも......はい、3体作って名前を付けましたよ。\n");

		//ここにRobotクラスのインスタンスを３つ作り、
		//（インスタンス名はrobot1、robot2、robot3）
		//それぞれ名前を代入する処理を記述する。
		Robot robot1 = new Robot();
		robot1.energy = 10;
		robot1.name = "RF1";

		Robot robot2 = new Robot();
		robot2.energy = 10;
		robot2.name = "RF2";

		Robot robot3 = new Robot();
		robot3.energy = 10;
		robot3.name = "RF3";

		System.out.println("G博士：");
		System.out.println("よし、では確認にため2番目のロボットの中を覗いてみよう。\n");

		//ここに2番目のインスタンスの名前を表示する処理を記述する
		System.out.println(robot2.name + "\n");

		System.out.println("G博士：");
		System.out.println("OKじゃ。\n");

	}

}
