
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
    protected static int leven = 3;
    protected static int levelLevens;
    protected static int x;
    protected static int y;
    private CollisionEngine collisionEngine;
    private TileEngine tileEngine;
    public Hero(CollisionEngine collisionEngine, TileEngine tileEngine)
    {
        super();
        this.collisionEngine = collisionEngine;
        this.tileEngine = tileEngine;
        gravity = 9.807;
        acc = 0.6;
        drag = 0.8;
        setImage("p3.png");
    }
    public void levens()
    {
        Actor l = getOneIntersectingObject(Leven.class);
        if(l != null)
        {
            Greenfoot.playSound("floop2_x.wav");
            leven ++;
            levelLevens ++;
            Punten.scoreToevoegenLeven();
            getWorld().removeObject(l);
            if(levelLevens == 4)
            {
                Greenfoot.setWorld(new SelectLevel());
                levelLevens = 0;
            }
            if(leven >= 25)
            {
                leven = 25;
            }
        }
    }
    @Override
    public void act()
    {
        handleInput();
        levens();
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
                    Greenfoot.playSound("gulp_x.wav");
                    setLocation(x, y);
                    return;
                }
                else
                {
                    Greenfoot.setWorld(new GameOverScherm());
                }
            }

        }
        for(Actor Water: getIntersectingObjects(Water.class))
        {
            if (Water != null)
            {
                leven --;
                if(leven != 0)
                {
                    Greenfoot.playSound("bubbling2.wav");  
                    setLocation(x, y);
                    return;
                }
                else
                {
                    Greenfoot.setWorld(new GameOverScherm());
                }
            }
        }
    }
    public void handleInput()
    {
        if (Greenfoot.isKeyDown("w") && (onGround() == true)
        || Greenfoot.isKeyDown("up") && (onGround() == true)
        || Greenfoot.isKeyDown("space") && (onGround() == true))
        {
            Greenfoot.playSound("boing_x.wav"); 
            velocityY = -15;
        }
        if (Greenfoot.isKeyDown("a")|| Greenfoot.isKeyDown("left"))
        {
            velocityX = -5;
        }
        if (Greenfoot.isKeyDown("d")|| Greenfoot.isKeyDown("right"))
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
