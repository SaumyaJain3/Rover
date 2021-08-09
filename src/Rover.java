public class Rover {
    private Direction direction;
    private int x_axis;
    private int y_axis;
    Direction[] values=Direction.values();
    String[] directionName={"N","E","S","W"};


    public Rover(int x_axis, int y_axis, Direction direction) {
        this.direction=direction;
        this.x_axis = x_axis;
        this.y_axis = y_axis;
    }

    public Direction rotateLeft() {
        this.direction=(this.direction==Direction.NORTH)? Direction.WEST:values[(this.direction.ordinal()-1)%4];

        return (this.direction);
    }

    public Direction rotateRight() {
        this.direction=values[(this.direction.ordinal()+1)%4];
        return this.direction;
    }

    public void move() {

        if(this.direction==Direction.NORTH)
            this.y_axis++;
        else if(this.direction==Direction.EAST)
            this.x_axis++;

        else if(this.direction==Direction.SOUTH)
            this.y_axis--;
        else
            this.x_axis--;
    }

    public void process(Character command) {
        if (command.equals('L')) {
            rotateLeft();
        } else if (command.equals('R')) {
            rotateRight();
        } else if (command.equals('M')) {
            move();

        } else {
            throw new IllegalArgumentException(
                    "Command not found");
        }
    }
    public String getPositions()
    {
        return (this.x_axis+" "+this.y_axis+" "+directionName[this.direction.ordinal()]);
    }
}
