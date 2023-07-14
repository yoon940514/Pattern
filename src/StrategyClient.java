import pattern.strategy.Aircraft;
import pattern.strategy.Tank;
import pattern.strategy.Weapon;
import pattern.strategy.strategy.Canonstrategy;
import pattern.strategy.strategy.Drivingstrategy;
import pattern.strategy.strategy.Flyingstrategy;
import pattern.strategy.strategy.Missilestrategy;

public class StrategyClient {

	public static void main(String[] args) {
		Weapon aircraft = new Aircraft("aircraft");
		Weapon tank = new Tank("tank");
		
		aircraft.setAttackstrategy(new Missilestrategy());
		aircraft.setMovingstrategy(new Flyingstrategy());
		
		tank.setAttackstrategy(new Canonstrategy());
		tank.setMovingstrategy(new Drivingstrategy());
		
		System.out.println("my name is " + aircraft.getName());
		aircraft.attack();
		aircraft.move();
		
		System.out.println();
		
		System.out.println("my name is " + tank.getName());
		tank.attack();
		tank.move();
	}
}
