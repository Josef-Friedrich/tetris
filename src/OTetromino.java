import greenfoot.*;

/**
 * represents a O tetromino
 *
 * @author Dietrich Boles (University of Oldenburg, Germany)
 * @version 1.0 (30.10.2008)
 */
public class OTetromino extends Tetromino
{
    OTetromino()
    {
        super("O");
    }

    protected void addedToWorld(World world)
    {
        direction = NORTH;
        int start = genStartX();
        getWorld().addObject(blocks[0], start, 0);
        getWorld().addObject(blocks[1], start + 1, 0);
        getWorld().addObject(blocks[2], start, 1);
        getWorld().addObject(blocks[3], start + 1, 1);
    }

    protected void setDirection()
    {}

    protected boolean isTurnPossible()
    {
        return false;
    }

    protected Block getMostLeft()
    {
        return blocks[0];
    }

    protected Block getMostRight()
    {
        return blocks[1];
    }

    protected int genStartX()
    {
        return (int) (Math.random() * (TetrisWorld.getWorld().getWidth() - 1));
    }
}
