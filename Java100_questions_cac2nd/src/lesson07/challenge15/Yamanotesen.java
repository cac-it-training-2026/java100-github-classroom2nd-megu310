package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Yamanotesen {
	//まだ使われていない駅の中からランダムに一つ駅を返すメソッド
	public static Station getRandomUnusedStation(List<Station> stations) {
		//空のリストを用意
		List<Station> unusedList = new ArrayList<>();

		//拡張for文
		for (Station s : stations) {
			//未使用の駅だけunusedListに入れる
			if (!s.getUsedFlg()) {
				unusedList.add(s);
			}
		}

		//空、答えられる駅がない場合はnull
		if (unusedList.isEmpty()) {
			return null;
		}

		Random random = new Random();
		Station cpuAnswer = unusedList.get(random.nextInt(unusedList.size()));
		return cpuAnswer;
	}

	public static void main(String[] args) throws IOException {
		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("      ゲームスタート！    ");

		//ArrayListクラスを宣言
		List<Station> stations = new ArrayList<>();

		//山手線の配列を作成
		String[] yamanotesen = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎",
				"原宿", "品川", "目白", "大塚", "上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鴬谷", "代々木", "新大久保", "巣鴨",
				"高輪ゲートウェイ" };
		//拡張for文　配列yamanotesenから1個ずつ取り出して、stationsオブジェクトにして、stationsリストに追加！
		for (String name : yamanotesen) {
			stations.add(new Station(name));
		}

		//ゲームが終わるまで繰り返す　isfinishedがfalseの間は続く！
		boolean isfinished = false;

		while (!isfinished) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String inputStation = reader.readLine();

			// 山手線名でない場合falseのまま終わるフラグを持たせる
			boolean isYamanote = false;
			// ループ処理で判定
			for (Station s : stations) {
				if (s.getStationName().equals(inputStation)) {
					isYamanote = true;
					// 入力された駅名と一致した場合、既出かどうかを判定する処理を行う
					if (s.getUsedFlg()) {
						// true,つまり既出だった場合
						System.out.println("あなたの負けです！");
						isfinished = true;
						// ゲーム終了のため、繰り返し処理を抜ける
						break;
					} else {
						// false,つまり既出でなかった場合
						s.setUsedFlg(true);
						// 既出でない駅名をランダムで1つ表示して既出にする
						Station cpuAnswer = getRandomUnusedStation(stations);
						if (cpuAnswer == null) {
							System.out.println("あなたの勝ちです！");
							isfinished = true;
						} else {
							System.out.println(cpuAnswer.getStationName());
							cpuAnswer.setUsedFlg(true);
							// 出し尽くしたかどうかを判定し、出し尽くしていた場合はユーザの勝利
							if (getRandomUnusedStation(stations) == null) {
								System.out.println("あなたの勝ちです！");
							}
							;
						}
					}
				}
			}
			// 一致する名前が見つからなかった場合、ユーザの負け
			if (!isYamanote) {
				System.out.println("あなたの負けです！");
				isfinished = true;
			}
		}
	}
}

class Station {
	private String stationName;
	private boolean usedFlg;

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public boolean getUsedFlg() {
		return usedFlg;
	}

	public void setUsedFlg(boolean usedFlg) {
		this.usedFlg = usedFlg;
	}

	//コンストラクタ　駅を作るときに、駅名をセット！
	public Station(String stationName) {
		this.stationName = stationName;
		this.usedFlg = false;
	}

}
