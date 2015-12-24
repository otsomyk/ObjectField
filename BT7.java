package tank;

public class BT7 extends AbstractTank {

	final int speed = super.getSpeed() * 2;

	public BT7(ActionField af, BattleField bf) {
		super(af, bf);

	}

	public int getSpeed() {
		return speed;
	}
}