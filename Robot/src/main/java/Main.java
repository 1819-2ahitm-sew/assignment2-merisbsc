import at.htl.robot.model.Robot;

public class Main {

    public static void main(String[] args) {

        // Do something with the robot

        Robot robot = new Robot();

        System.out.println("x = " + robot.getX());
        System.out.println("y = " + robot.getY());
        System.out.println("Direction = " + robot.getDirection());

        System.out.println();
        robot.stepForward();

        System.out.println("x = " + robot.getX());
        System.out.println("y = " + robot.getY());
        System.out.println("Direction = " + robot.getDirection());

        System.out.println();
        robot.rotateLeft();
        robot.rotateLeft();

        System.out.println("x = " + robot.getX());
        System.out.println("y = " + robot.getY());
        System.out.println("Direction = " + robot.getDirection());

    }

}
