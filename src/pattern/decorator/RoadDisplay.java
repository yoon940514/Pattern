package pattern.decorator;

public class RoadDisplay extends Display{
	
	 public RoadDisplay() {
	    }

	@Override
	public void draw() {
		System.out.println("기본 도로 표시");
	}

}
