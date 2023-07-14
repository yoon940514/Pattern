package pattern.observer;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {	// MinMaxView 클래스는 Observer의 기능, 즉 update 메서드를 구현함으로써 통보 대상이 됨.
	private ScoreRecord scoreRecord;
	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}
	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();	// 점수를 조회함
		displayMinMax(record);
	}
	
	@SuppressWarnings("unused")
	private void displayMinMax(List<Integer> record) {
		int min = Collections.min(record, null);
		int max = Collections.max(record, null);
		System.out.println("Min: " + min + "Max: " + max);
	}
}
