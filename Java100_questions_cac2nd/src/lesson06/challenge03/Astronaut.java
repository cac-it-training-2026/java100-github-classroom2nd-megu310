/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題3 宇宙船の機能を切り替える
 *
 * 宇宙船クラス（Spaceship）にフィールド一つとメソッド二つを
 * 追加して、使用燃料を指定して航行するモードと、燃料を指定せずの
 * 自動で航行するモードを、引数の違いだけで切り替えること
 * ができるようにしてください。（オーバーロード）
 *
 * 宇宙船の燃料タンク(fuel)とsetter、getterを記述する。
 * メソッドconsumingFuel()を引数あり、なしでそれぞれ作成する。
 * （戻り値はlightYears）
 * 引数ありの方は受け取った値10倍する。fuelから受け取った値を引く。
 * なしの方はfuel/2の値を10倍する。fuelの値は1/2になる。
 * 実行例と同じメッセージを表示しください。
 *
 * <実行例>
 * 空気を入れてください＞○
 * 燃料を入れてください＞○
 *
 * 【※設定した値】リットルの空気が入りました。
 *
 * 自動で航行します。
 * 航行距離：○○○光年
 *
 * 燃料で航行します。
 * 使用燃料を入力してください＞○
 * 航行距離：○○○光年
 *
 */

package lesson06.challenge03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Spaceship {
	private int air;
	//ここにフィールドを追加する。
	private int fuel;

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getAir() {
		return air;
	}

	public void setAir(int air) {
		this.air = air;
	}

	//ここに適切な処理を記述する。
	int consumingFuel() {
		int lightYears = fuel / 2 * 10;
		fuel -= fuel / 2;
		return lightYears;
	}

	int consumingFuel(int consumingFuel) {
		int lightYears = consumingFuel * 10;
		fuel -= consumingFuel * 10;
		return lightYears;
	}

}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("空気を入れてください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String airStr = br.readLine();
		int air = Integer.parseInt(airStr);

		System.out.print("燃料を入れてください＞");
		String fuelStr = br.readLine();
		int fuel = Integer.parseInt(fuelStr);

		Spaceship spaceship = new Spaceship();
		spaceship.setAir(air);

		//ここでフィールドのfuelに値を設定する。
		spaceship.setFuel(fuel);

		System.out.println("\n" + spaceship.getAir() + "リットルの空気が入りました。");

		System.out.println("自動で航行します。");

		//ここに適切な処理を記述する。
		int lightYears = spaceship.consumingFuel();
		System.out.println("航行距離：" + lightYears + "光年\n");

		System.out.println("燃料で航行します。");
		System.out.print("使用燃料を入力してください＞");
		String consumingFuelStr = br.readLine();
		int consumingFuel = Integer.parseInt(consumingFuelStr);

		//ここに適切な処理を記述する。
		lightYears = spaceship.consumingFuel(consumingFuel);
		System.out.println("航行距離：" + lightYears + "光年\n");

	}

}
