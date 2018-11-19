
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover
{
    private final double gravity;
    private final double acc;
    private final double drag;
    private int leven = 3;
    public Hero()
    {
        super();
        gravity = 9.807;
        acc = 0.6;
        drag = 0.8;
        setImage("p3.png");
    }
    @Override
    public void act()
    {
        handleInput();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity)
        {
            velocityY = gravity;
        }
        applyVelocity();
        for (Actor enemy : getIntersectingObjects(Enemy.class))
        {
            if (enemy != null)
            {
                leven --;
                if(leven != 0)
                {
                    setLocation(93, 2835);
                    return;
                }
                //else
                //{
                    //GameOver gameover = new GameOver();
                    //MyWorld.addObject(gameover, MyWorld.getWidth()/2, MyWorld.getHeight()/2);
                    //MyWorld.removeObject(this);
                //}
            }
        }
    }
    public void handleInput()
    {
        if (Greenfoot.isKeyDown("w") && (onGround() == true)
        || Greenfoot.isKeyDown("up") && (onGround() == true)
        || Greenfoot.isKeyDown("space") && (onGround() == true))
        {
            velocityY = -15;
        }
        if (Greenfoot.isKeyDown("a")|| Greenfoot.isKeyDown("left"))
        {
            velocityX = -5;
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            velocityX = 5;
        }
        if(Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("a")
        || Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("left"))
        {
            velocityX -= 2;
        }
        if(Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("d")
        || Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("right"))
        {
            velocityX += 2;
        }
    }
    public int getWidth()
    {
        return getImage().getWidth();
    }
    public int getHeight()
    {
        return getImage().getHeight();
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return under != null;
    }
}
