import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    public void leftOfSouthIsEast()
    {
        Rover rover=new Rover(1, 2, Direction.SOUTH);
        Assertions.assertEquals(Direction.EAST,rover.rotateLeft());
    }

    @Test
    public void leftOfEastIsNorth()
    {
        Rover rover=new Rover(1, 2, Direction.EAST);
        Assertions.assertEquals(Direction.NORTH,rover.rotateLeft());
    }

    @Test
    public void leftOfNorthIsWest()
    {
        Rover rover=new Rover(1, 2, Direction.NORTH);
        Assertions.assertEquals(Direction.WEST,rover.rotateLeft());
    }

    @Test
    public void leftOfWestIsSouth()
    {
        Rover rover=new Rover(1, 2, Direction.WEST);
        Assertions.assertEquals(Direction.SOUTH,rover.rotateLeft());
    }

    @Test
    public void rightOfNorthIsEast()
    {
        Rover rover=new Rover(1, 2, Direction.NORTH);
        Assertions.assertEquals(Direction.EAST,rover.rotateRight());
    }

    @Test
    public void rightOfEastIsSouth()
    {
        Rover rover=new Rover(1, 2, Direction.EAST);
        Assertions.assertEquals(Direction.SOUTH,rover.rotateRight());
    }

    @Test
    public void rightOfSouthIsWest()
    {
        Rover rover=new Rover(1, 2, Direction.SOUTH);
        Assertions.assertEquals(Direction.WEST,rover.rotateRight());
    }

    @Test
    public void rightOfWestIsNorth()
    {
        Rover rover=new Rover(1, 2, Direction.WEST);
        Assertions.assertEquals(Direction.NORTH,rover.rotateRight());
    }

    @Test
    public void moveFromNorthToYPlus1()
    {
        Rover rover=new Rover(1,2,Direction.NORTH);
        rover.move();
        Assertions.assertEquals("1 3 N",rover.getPositions());
    }

    @Test
    public void processRoverOneCommand()
    {
        Rover rover=new Rover(1,2,Direction.NORTH);
        rover.rotateLeft();
        rover.move();
        rover.rotateLeft();
        rover.move();
        rover.rotateLeft();
        rover.move();
        rover.rotateLeft();
        rover.move();
        rover.move();
        Assertions.assertEquals("1 3 N",rover.getPositions());
    }

    @Test
    public void processRoverSecondCommandResults51E()
    {
        Rover rover=new Rover(3,3,Direction.EAST);
        rover.move();
        rover.move();
        rover.rotateRight();
        rover.move();
        rover.move();
        rover.rotateRight();
        rover.move();
        rover.rotateRight();
        rover.rotateRight();
        rover.move();

        Assertions.assertEquals("5 1 E",rover.getPositions());
    }



}
