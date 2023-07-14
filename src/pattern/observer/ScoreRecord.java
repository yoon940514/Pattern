package pattern.observer;

import java.util.*;

public class ScoreRecord extends Subject {
	private List<Integer> scores = new ArrayList<Integer>();
	
	public void addScore(int score) {
		scores.add(score);	
		
		notifyObservers();	// 데이터가 변경되면 Subject 클래스의 notifyObservers 메서드를 호출해 각 옵서버 (통보 대상 클래스)에게 데이터의 변경을 통보함
	}
	
	public List<Integer> getScoreRecord() {
		return scores;
	}
}
