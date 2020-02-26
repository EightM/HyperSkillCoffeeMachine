public static void moveRobot(Robot robot, int toX, int toY) {
    int currentX = robot.getX();
    int currentY = robot.getY();
    Direction currentDirection = robot.getDirection();

    if (currentX > toX) {
        while (!robot.getDirection().equals(Direction.LEFT)) {
            robot.turnLeft();
        }
    } else if (currentX < toX) {
        while (!robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnRight();
        }
    }

    while (currentX != toX) {
        robot.stepForward();
        currentX = robot.getX();
    }

    if (currentY > toY) {
        while (!robot.getDirection().equals(Direction.DOWN)) {
            robot.turnLeft();
        }
    } else if (currentY < toY) {
        while (!robot.getDirection().equals(Direction.UP)) {
            robot.turnRight();
        }
    }

    while (currentY != toY) {
        robot.stepForward();
        currentY = robot.getY();
        }
}