/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		//最初の在庫数
		double citronStock = 30;
		double chocolatStock = 30;
		double pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		//キーボード入力できるようにする
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン      >");
		//キーボードでシトロンの数を入力
		String citronBuyCountStr = br.readLine();
		//文字列→小数に
		double citronBuyCount = Double.parseDouble(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = br.readLine();
		double chocolatBuyCount = Double.parseDouble(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = br.readLine();
		double pistacheBuyCount = Double.parseDouble(pistacheBuyCountStr);

		//それぞれの購入数を表示
		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		//double型　totalBuyCountに3種類の合計購入数を代入
		double totalBuyCount = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		double totalCitronPrice = 250 * citronBuyCount;
		double totalChocolatPrice = 280 * chocolatBuyCount;
		double totalPistachePrice = 320 * pistacheBuyCount;
		double totalPrice = totalCitronPrice + totalChocolatPrice + totalPistachePrice;

		System.out.println("\n合計個数    " + totalBuyCount + "個");
		System.out.println("合計金額   " + totalPrice + "円");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		//残りの在庫
		citronStock = citronStock - citronBuyCount;
		chocolatStock = chocolatStock - chocolatBuyCount;
		pistacheStock = pistacheStock - pistacheBuyCount;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		//売上比を求める→少数から整数にキャスト　小数点以下が切り捨てられるからこの後正確な計算ができなくなる？間違い
		int citronPercentage = (int) (totalCitronPrice / totalPrice * 100);
		int chocolatPercentage = (int) (totalChocolatPrice / totalPrice * 100);
		int pistachePercentage = (int) (totalPistachePrice / totalPrice * 100);

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上合計      \\" + totalPrice);
		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) totalCitronPrice + "・・・ " + citronPercentage + "%");
		System.out.println("ショコラ      \\" + (int) totalChocolatPrice + "・・・ " + chocolatPercentage + "%");
		System.out.println("ピスターシュ  \\" + (int) totalPistachePrice + "・・・ " + pistachePercentage + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("\nシトロンの味    ・・・ " + citronPercentage + "%");
		System.out.println("ショコラの味    ・・・ " + chocolatPercentage + "%");
		System.out.println("ピスターシュの味・・・ " + pistachePercentage + "%");

		System.out.println("\nが楽しめます！");

		//価格はマカロン１個あたりの平均売上価格
		System.out.println("\n値段は\\" + (((int) totalPrice / (int) totalBuyCount) / 10 * 10) + "です。");
	}

}
