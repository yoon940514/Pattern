package pattern.observer;

import java.util.*;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();	// 통보 대상 목록
	
	public void attach(Observer observer) {	// 옵서버, 즉 통보 대상을 추가함
		observers.add(observer);
	}
	
	public void detach(Observer observer) {	// 옵서버, 즉 통보 대상을 제거함
		observers.remove(observer);
	}
	
	public void notifyObservers() {	
		for (Observer o: observers) {
			o.update();
		}
	}
}
