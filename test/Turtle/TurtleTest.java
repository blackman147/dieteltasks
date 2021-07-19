package Turtle;

import PersonalKata.turtle_graphics.Pen;
import PersonalKata.turtle_graphics.Position;
import PersonalKata.turtle_graphics.Sketchpad;
import PersonalKata.turtle_graphics.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static PersonalKata.Directions.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Turtle turtle;
    Pen pen;


    @BeforeEach
    void startWithThis(){
        pen = new Pen();
        turtle = new Turtle(pen);


    }

    @Test
    void turtleHasAPen(){
        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
    }

    @Test
    void penCanMovePenUp(){
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    void penCanMovePenDown(){
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    void turtleCanTurnRightWhileFacingEast(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingSouth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST,turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingWest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH,turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingNORTH(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH,turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(EAST,turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingEast(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingNorth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardWhileFacingEast(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingSouth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(5,5), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingWest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(5,5), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(5,0), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingNorth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(5,5), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(5,0), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.moveForward(5);
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingEast(){
        turtle.penDown();
        Sketchpad sketchpad = new Sketchpad(20,20);
        int numberOfSteps = 5;
        turtle.writeOn(sketchpad, 5);
        int counter = 0;
        var floor = sketchpad.getFloor();
        while ( counter< numberOfSteps){
            assertEquals(1, sketchpad.getFloor()[0][counter]);
            counter++;
        }
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
    }

}










