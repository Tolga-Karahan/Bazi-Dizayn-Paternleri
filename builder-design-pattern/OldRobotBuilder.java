// Robot parcalarini bir araya getiren Builder sinifi

public class OldRobotBuilder implements RobotBuilder{

	private Robot robot;

	public OldRobotBuilder(){
		robot = new Robot();
	}

	public void buildRobotHead(){
		robot.setRobotHead("Tin Head");
	}

	public void buildRobotTorso(){
		robot.setRobotTorso("Tin Torso");
	}

	public void buildRobotArms(){
		robot.setRobotArms("Blowtorch Arms");
	}

	public void buildRobotLegs(){
		robot.setRobotLegs("Rollar Skates");
	}

	public Robot getRobot(){
		return this.robot;
	}
}