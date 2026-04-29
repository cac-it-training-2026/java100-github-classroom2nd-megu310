/**
 * 第7章 武士のお仕事
 *
 * 問題12 インターフェース①
 *
 * 勘定奉行インターフェースを作る。
 *
 * 抽象メソッドfigure()を持つ勘定奉行インターフェースIChiefTreasurerを
 * 作成し、問題3で作成した奉行クラスMagistrateに実装してください。
 *
 * <実行例>
 * 奉行に勘定奉行を兼ねてもらうことになりました。
 *
 * 奉行1：
 * 藩の資産を計算するよ～。
 *
 */

package lesson07.challenge12;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	void figure();
}

//ここにSamuraiクラスを記述
abstract class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {

	protected String domain;

	public Retainer() {

	}

	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	@Override
	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	@Override
	public String toString() {
		return "拙者は" + domain + "藩士、" + name + "ともうす。";
	}

	@Override
	public boolean equals(Object object) {
		boolean isMatch;
		Retainer retainer = (Retainer) object;
		if (this.domain.equals(retainer.domain)) {
			isMatch = true;
		} else {
			isMatch = false;
		}
		return isMatch;
	}
}

//ここにMagistrateクラスを記述
class Magistrate extends Retainer implements IChiefTreasurer {

	void judge() {
		System.out.println("判決を下すよ～。");
	}

	@Override
	public void figure() {
		System.out.println("藩の資産を計算するよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("奉行に勘定奉行を兼ねてもらうことになりました。\n");

		System.out.println("奉行1：");

		//ここに適切な処理を記述
		Magistrate magistrate1 = new Magistrate();
		magistrate1.figure();
	}
}
