/**
 * 第7章 武士のお仕事
 *
 * 問題8  equals()メソッドの利用
 *
 * equals()メソッドを適切にオーバーライドする。
 *
 * 問題7で作成した藩士クラスにequals()メソッドをオーバーライドする
 * 記述を追加し、同じ藩の所属かどうか確認する処理に変更してください。
 * （※藩士クラスにフィールドprotected String domainを追記）
 * （名前と一緒に藩名もコンストラクタで設定する）
 *
 * <実行例>
 * ○△□藩の藩士を二つ作ります。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 * 拙者は○△□藩士、テスト次郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属しています】
 *
 * ○△×藩の藩士を一つ作ります。
 *
 * 拙者は○△×藩士、テスト三郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属していません】
 *
 */

package lesson07.challenge08;

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

//ここにRetainerクラス（藩士クラス）を記述
class Retainer extends Samurai {

	protected String domain;

	//コンストラクタ
	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	@Override
	//オーバーライドすることで、親クラスのメソッドと同じシグネチャのメソッドをサブクラスで再定義
	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	@Override
	public String toString() {
		return "拙者は○△□藩士、" + name + "ともうす。";
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

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("○△□藩の藩士を二つ作ります。\n");

		//ここに適切な処理を記述
		Retainer retainer1 = new Retainer("テスト太郎", "○△□");
		Retainer retainer2 = new Retainer("テスト次郎", "○△□");
		System.out.println(retainer1);
		System.out.println(retainer2);

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		if (retainer1.equals(retainer2)) {
			System.out.println("【同じ藩に所属しています】");
		} else {
			System.out.println("【同じ藩に所属していません】");
		}

		System.out.println("\n○△×藩の藩士を一つ作ります。\n");
		//ここに適切な処理を記述
		Retainer retainer3 = new Retainer("テスト三郎", "○△×");
		System.out.println(retainer3);

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		if (retainer1.equals(retainer3)) {
			System.out.println("【同じ藩に所属しています】");
		} else {
			System.out.println("【同じ藩に所属していません】");
		}

	}
}
