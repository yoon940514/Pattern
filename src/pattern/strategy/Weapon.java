package pattern.strategy;

import pattern.strategy.strategy.Attackstrategy;
import pattern.strategy.strategy.Movingstrategy;

public abstract class Weapon {
	private String name;
	private Movingstrategy movingstrategy;
	private Attackstrategy attackstrategy;
	
	public String getName() {
		return name;
	}
	
	public Weapon(String name) {
		this.name = name;
	}
	
	public void move() {
		movingstrategy.move();
	}
	
	public void attack() {
		attackstrategy.attack();
	}


	public void setMovingstrategy(Movingstrategy movingstrategy) {
		this.movingstrategy = movingstrategy;
	}

	public void setAttackstrategy(Attackstrategy attackstrategy) {
		this.attackstrategy = attackstrategy;
	}
	
	
}
