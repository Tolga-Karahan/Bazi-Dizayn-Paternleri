// Engineer sinifi RobotBuilder taslagini kullanarak robotu uretir

public class RobotEngineer{

	private RobotBuilder robotBuilder;

	public RobotEngineer(RobotBuilder robotBuilder){
		this.robotBuilder = robotBuilder;
	}

	public Robot getRobot(){
		return this.robotBuilder.getRobot();
	}

	// RobotBuilder metodlarini cagirarak Robot u uret
	
	public void makeRobot(){
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}
}