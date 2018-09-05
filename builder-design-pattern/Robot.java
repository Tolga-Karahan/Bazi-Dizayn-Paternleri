// RobotPlan arayuzune gore implement edilmis Robot sinifi

public class Robot implements RobotPlan{

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;

	public void setRobotHead(String robotHead){
		this.robotHead = robotHead;
	}

	public String getRobotHead(){
		return robotHead;
	}

	public void setRobotTorso(String robotTorso){
		this.robotTorso = robotTorso;
	}

	public String getRobotTorso(){
		return robotTorso;
	}

	public void setRobotArms(String robotArms){
		this.robotArms = robotArms;
	}

	public String getRobotArms(){
		return robotArms;
	}

	public void setRobotLegs(String robotLegs){
		this.robotLegs = robotLegs;
	}

	public String getRobotLegs(){
		return robotLegs;
	}

}