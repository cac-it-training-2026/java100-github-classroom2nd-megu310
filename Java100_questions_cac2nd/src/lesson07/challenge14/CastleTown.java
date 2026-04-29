/**
 * 第7章 武士のお仕事
 *
 * 問題14 複数のインターフェースを実装する
 *
 * 勘定奉行インタフェース、文化人インターフェースを実装する。
 *
 * 藩士クラスに勘定奉行インターフェースと文化人インターフェースを
 * 実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 *
 */

package lesson07.challenge14;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	void figure();
}

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	void learn();
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
class Retainer extends Samurai implements ICelebrity, IChiefTreasurer {

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

	@Override
	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}

	@Override
	public void figure() {
		System.out.println("藩の資産を計算するよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述;
		Retainer retainer1 = new Retainer();
		retainer1.figure();
		retainer1.learn();
	}
}
