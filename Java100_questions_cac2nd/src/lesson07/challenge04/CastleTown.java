/**
 * 第7章 武士のお仕事
 *
 * 問題4  オーバーライド①
 *
 * 侍クラス（Samurai）のメソッドをオーバーライドする。
 *
 * 侍クラス（Samurai）にwork()メソッド（戻り値void）を追記し、
 * 藩士クラスでオーバーライドしてください。
 *
 * <実行例>
 * 侍は働きます。
 *
 * 侍1：
 * 何かして働くよ～。
 *
 * 具体的に言うと藩士は年貢を取り立てます。
 *
 * 藩士1：
 * 年貢を取り立てるよ～。
 *
 */

package lesson07.challenge04;

class Samurai {

	void fight() {
		System.out.println("戦うよ～。");
	}

	//ここにwork()メソッドを記述
	void work() {
		System.out.println("何かして働くよ～。");

	}

}

//ここに問題1で作成したRetainer藩士クラスを改変して記述
class Retainer extends Samurai {
	public void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	@Override
	void work() {
		System.out.println("年貢を取り立てるよ～。");

	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("侍は働きます。\n");

		System.out.println("侍1：");

		//ここに必要な処理を記述
		Samurai samrai = new Samurai();
		samrai.work();

		System.out.println("\n具体的に言うと藩士は年貢を取り立てます。\n");

		System.out.println("藩士1：");

		//ここに必要な処理を記述
		Retainer retainer = new Retainer();
		retainer.work();

	}
}
