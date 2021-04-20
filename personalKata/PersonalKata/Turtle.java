package PersonalKata;

import static PersonalKata.Directions.*;

public class Turtle {


    private Pen pen;
    private Directions currentDirection;
    private Position currentPosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        currentDirection = EAST;
        currentPosition = new Position(0,0);
    }

    public Pen getPen() {
        return pen;
    }

    public void penUp() {
        pen.moveUp(true);
    }

    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void penDown() {
        pen.moveUp(false);
    }

    public void turnRight() {
        if (currentDirection == EAST)
            currentDirection = SOUTH;
        else
            if (currentDirection == SOUTH)
                currentDirection = WEST;
        else
            if (currentDirection == WEST)
                currentDirection = NORTH;
        else
            if (currentDirection == NORTH)
                currentDirection = EAST;
    }

    public Directions getCurrentDirection() {

        return  currentDirection;
    }

    public void turnLeft() {
        if (currentDirection == EAST)
            currentDirection = NORTH;
        else
            if (currentDirection == NORTH)
                currentDirection = WEST;
        else
            if (currentDirection == WEST)
                currentDirection = SOUTH;
        else
            if (currentDirection == SOUTH)
                currentDirection = EAST;

    }

    public void moveForward(int noOfSteps) {
        switch (currentDirection){
            case EAST -> currentPosition.increaseNumberOfColumn(noOfSteps);
            case SOUTH -> currentPosition.increaseNumberOfRow(noOfSteps);
            case WEST -> currentPosition.decreaseNumberOfColumn(noOfSteps);
            case NORTH -> currentPosition.decreaseNumberOfRow(noOfSteps);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
