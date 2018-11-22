import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadGuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadGuy extends Mover
{
    private final double gravity;
    private final double acc;
    private final double drag;
    private GreenfootImage run1r = new GreenfootImage("undercover_walk1.png");
    private GreenfootImage run2r = new GreenfootImage("undercover_walk2.png");
    private GreenfootImage run3r = new GreenfootImage("undercover_walk3.png");
    private GreenfootImage run4r = new GreenfootImage("undercover_walk4.png");
    private GreenfootImage run5r = new GreenfootImage("undercover_walk5.png");
    private GreenfootImage run6r = new GreenfootImage("undercover_walk6.png");
    private GreenfootImage run7r = new GreenfootImage("undercover_walk7.png");
    private GreenfootImage run8r = new GreenfootImage("undercover_walk8.png");
    private GreenfootImage run9r = new GreenfootImage("undercover_walk9.png");
    private GreenfootImage run10r = new GreenfootImage("undercover_walk10.png");
    private GreenfootImage run11r = new GreenfootImage("undercover_walk11.png");
    private int frame = 1;
    private int animationCounter = 0;
    public BadGuy()
    {
        super();
        gravity = 9.807;
        acc = 0.6;
        drag = 0.8;
        setImage("nudercover_three_eye.png");
    }
    public void addedToWorld(World w)
    {
        getWorld();
    }
    /**
     * Act - do whatever the BadGuy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleInput();
        velocityX *= drag;
        velocityY += acc;
        applyVelocity();
        animationCounter ++;
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
            if(animationCounter % 11 == 0)
            {
                animateRight();
            }
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            velocityX = 5;
            if(animationCounter % 11 == 0)
            {
                animateRight();
            }
        }
        if(Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("a")
        || Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("left"))
        {
            velocityX -= 2;
            if(animationCounter % 11 == 0)
            {
                animateRight();
            }
        }
        if(Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("d")
        || Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("right"))
        {
            velocityX += 2;
            if(animationCounter % 11 == 0)
            {
                animateRight();
            }
        }
        getImage().mirrorHorizontally();
    }
    public void animateRight()
    {
        if(frame ==1)
        {
            setImage(run1r);
        }
        else if(frame ==2)
        {
            setImage(run2r);
        }
        else if(frame ==3)
        {
            setImage(run3r);
        }
        else if(frame ==4)
        {
            setImage(run4r);
        }
        else if(frame ==5)
        {
            setImage(run5r);
        }
        else if(frame ==6)
        {
            setImage(run6r);
        }
        else if(frame ==7)
        {
            setImage(run7r);
        }
        else if(frame ==8)
        {
            setImage(run8r);
        }
        else if(frame ==9)
        {
            setImage(run9r);
        }
        else if(frame ==10)
        {
            setImage(run10r);
        }
        else if(frame ==11)
        {
            setImage(run11r);
            frame = 1;
            return;
        }
        frame ++;
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
