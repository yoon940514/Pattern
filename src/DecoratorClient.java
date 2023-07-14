import pattern.decorator.*;

public class DecoratorClient {
	public static void main(String[] args) {
		Display road = new RoadDisplay();
		road.draw(); // 기본 도로 표시
		
		System.out.println();
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw(); // 기본 도로 표시 + 차선 표시
		
		System.out.println();
		
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw(); // 기본 도로 표시 + 차선 표시 + 교통량 표시
		
		System.out.println();
		
		Display roadWithLaneAndTrafficCrossing = new TrafficDecorator(new CrossingDecorator(new LaneDecorator(new RoadDisplay())));
		roadWithLaneAndTrafficCrossing.draw();	 // 기본 도로 표시 + 차선 표시 + 교차로표시 + 교통량 표시
	}
}
