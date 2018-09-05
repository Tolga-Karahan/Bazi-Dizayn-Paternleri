public class TestRobotBuilder{

	public static void main(String[] args){

		// OldRobotBuilder tipinde bir RobotBuilder uret

		RobotBuilder oldStyleRobot = new OldRobotBuilder();

		// OldRobotBuilder spesifikasyonunu Engineer sinifina gecir

		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

		// OldRobotBuilder spesifikasyonunu kullanarak robotu uret
		robotEngineer.makeRobot();

		Robot firstRobot = robotEngineer.getRobot();

		System.out.println("Robot built");

		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());

		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());

		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());

		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
	}
}