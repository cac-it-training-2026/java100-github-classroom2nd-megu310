/**
 * 第4章 倉庫番のお仕事
 *
 * 問題10 荷物の作成（ランダムに要素を詰める）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 箱の中にはいくつかの空き箱があります。
 * （空きは数値の0で表現します）
 * どの箱が空き箱になるのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例1>
 *  E主任：
 *  MQ運送から預かった荷物の確認をお願いします。
 *
 *  Yさん：
 *  はい、
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  です。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 * <実行例2>
 *  E主任：
 *  MQ運送から預かった荷物の確認をお願いします。
 *
 *  Yさん：
 *  はい、
 *
 *  C...5,0,0,0,9
 *
 *  D...0,6,0,3,7
 *
 *  E...2,5,0,6,10
 *
 *  です。
 *
 *  E主任：
 *  ご苦労さまでした。
 */

package lesson04.challenge10;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] MQArrayC = new int[5];
		int[] MQArrayD = new int[5];
		int[] MQArrayE = new int[5];

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		int[][] MQArrayAll = new int[3][5];
		MQArrayAll[0] = MQArrayC;
		MQArrayAll[1] = MQArrayD;
		MQArrayAll[2] = MQArrayE;

		//二重for文で全要素を回している
		//外側のi 何個目のコンテナか　内側のj　そのコンテナの何番目の荷物か
		for (int i = 0; i < MQArrayAll.length; i++) {
			//MQArrayAll[0].length　1行目の要素数→今回は5
			for (int j = 0; j < MQArrayAll[0].length; j++) {
				//ランダムで0,1,2,3が出る
				//一定の確率で0を入れていく。それ以外なら1～10を入れる。
				int rand = (int) (Math.random() * 10) % 4;
				if (rand == 0) {
					MQArrayAll[i][j] = 0;
				} else {
					MQArrayAll[i][j] = (int) (Math.random() * 10) % 10 + 1;

				}
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送から預かった荷物の確認をお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < MQArrayC.length; i++) {
			System.out.print(MQArrayC[i]);
			if (i != (MQArrayC.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < MQArrayD.length; i++) {
			System.out.print(MQArrayD[i]);
			if (i != (MQArrayD.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < MQArrayE.length; i++) {
			System.out.print(MQArrayE[i]);
			if (i != (MQArrayE.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nです。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
