
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
    int tijd = 0;
    private CollisionEngine collisionEngine;
    private TileEngine tileEngine;
    private GreenfootImage run1r = new GreenfootImage("p3_walk01.png");
    private GreenfootImage run2r = new GreenfootImage("p3_walk02.png");
    private GreenfootImage run3r = new GreenfootImage("p3_walk03.png");
    private GreenfootImage run4r = new GreenfootImage("p3_walk04.png");
    private GreenfootImage run5r = new GreenfootImage("p3_walk05.png");
    private GreenfootImage run6r = new GreenfootImage("p3_walk06.png");
    private GreenfootImage run7r = new GreenfootImage("p3_walk07.png");
    private GreenfootImage run8r = new GreenfootImage("p3_walk08.png");
    private GreenfootImage run9r = new GreenfootImage("p3_walk09.png");
    private GreenfootImage run10r = new GreenfootImage("p3_walk10.png");
    private GreenfootImage run11r = new GreenfootImage("p3_walk11.png");
    private GreenfootImage run1l = new GreenfootImage("p3_walk01.png");
    private GreenfootImage run2l = new GreenfootImage("p3_walk02.png");
    private GreenfootImage run3l = new GreenfootImage("p3_walk03.png");
    private GreenfootImage run4l = new GreenfootImage("p3_walk04.png");
    private GreenfootImage run5l = new GreenfootImage("p3_walk05.png");
    private GreenfootImage run6l = new GreenfootImage("p3_walk06.png");
    private GreenfootImage run7l = new GreenfootImage("p3_walk07.png");
    private GreenfootImage run8l = new GreenfootImage("p3_walk08.png");
    private GreenfootImage run9l = new GreenfootImage("p3_walk09.png");
    private GreenfootImage run10l = new GreenfootImage("p3_walk10.png");
    private GreenfootImage run11l = new GreenfootImage("p3_walk11.png");
    private int frame = 1;
    public Hero(CollisionEngine collisionEngine, TileEngine tileEngine)
    {
        super();
        this.collisionEngine = collisionEngine;
        this.tileEngine = tileEngine;
        gravity = 9.807;
        acc = 0.6;
        drag = 0.8;
        run1l.mirrorHorizontally();
        run2l.mirrorHorizontally();
        run3l.mirrorHorizontally();
        run4l.mirrorHorizontally();
        run5l.mirrorHorizontally();
        run6l.mirrorHorizontally();
        run7l.mirrorHorizontally();
        run8l.mirrorHorizontally();
        run9l.mirrorHorizontally();
        run10l.mirrorHorizontally();
        run11l.mirrorHorizontally();
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
        for(Actor lader: getIntersectingObjects(Lader.class))
        {
            if (lader != null)
            {
                if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")
                || Greenfoot.isKeyDown("space"))
                {
                    velocityY = -8;
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
            animationLeft();
        }
        if (Greenfoot.isKeyDown("d")|| Greenfoot.isKeyDown("right"))
        {
            velocityX = 5;
            animationRight();
        }
        if(Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("a")
        || Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("left"))
        {
            velocityX -= 5;
            animationLeft();
        }
        if(Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("d")
        || Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("right"))
        {
            velocityX += 5;
            animationRight();
        }
        tijd ++;
        if(tijd >= 10 && Greenfoot.isKeyDown("r"))
        {
            leven --;
            tijd = 0;
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
        Tile tile = (Tile) under;
        if(tile != null)
        {
            if(tile.isSolid)
            {
                return true;
            }
        }
        return false;
    }
    public void animationRight()
    {
        if(frame == 1)
        {
                setImage(run1r);
        }
        else if(frame == 2)
        {
                setImage(run2r);
        }   
        else if(frame == 3)
        {
                setImage(run3r);
        }
        else if(frame == 4)
        {
                setImage(run4r);
        }
        else if(frame == 5)
        {
                setImage(run5r);
        }
        else if(frame == 6)
        {
                setImage(run6r);
        }
        else if(frame == 7)
        {
                setImage(run7r);
        }
        else if(frame == 8)
        {
                setImage(run8r);
        }
        else if(frame == 9)
        {
                setImage(run9r);
        }
        else if(frame == 10)
        {
                setImage(run10r);
        }
        else if(frame == 11)
        {
                setImage(run11r);
                frame = 1;
        }
        frame ++;
    }
    public void animationLeft()
    {
        if(frame == 1)
        {
                setImage(run1l);
        }
        else if(frame == 2)
        {
                setImage(run2l);
        }   
        else if(frame == 3)
        {
                setImage(run3l);
        }
        else if(frame == 4)
        {
                setImage(run4l);
        }
        else if(frame == 5)
        {
                setImage(run5l);
        }
        else if(frame == 6)
        {
                setImage(run6l);
        }
        else if(frame == 7)
        {
                setImage(run7l);
        }
        else if(frame == 8)
        {
                setImage(run8l);
        }
        else if(frame == 9)
        {
                setImage(run9l);
        }
        else if(frame == 10)
        {
                setImage(run10l);
        }
        else if(frame == 11)
        {
                setImage(run11l);
                frame = 1;
        }
        frame ++;
    }
}
