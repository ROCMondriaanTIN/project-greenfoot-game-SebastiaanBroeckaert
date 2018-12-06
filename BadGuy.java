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
    private GreenfootImage run1l = new GreenfootImage("undercover_walk1.png");
    private GreenfootImage run2l = new GreenfootImage("undercover_walk2.png");
    private GreenfootImage run3l = new GreenfootImage("undercover_walk3.png");
    private GreenfootImage run4l = new GreenfootImage("undercover_walk4.png");
    private GreenfootImage run5l = new GreenfootImage("undercover_walk5.png");
    private GreenfootImage run6l = new GreenfootImage("undercover_walk6.png");
    private GreenfootImage run7l = new GreenfootImage("undercover_walk7.png");
    private GreenfootImage run8l = new GreenfootImage("undercover_walk8.png");
    private GreenfootImage run9l = new GreenfootImage("undercover_walk9.png");
    private GreenfootImage run10l = new GreenfootImage("undercover_walk10.png");
    private GreenfootImage run11l = new GreenfootImage("undercover_walk11.png");
    private int frame = 1;
    public BadGuy()
    {
        super();
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
        setImage("undercover_three_eye.png");
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
        if (velocityY > gravity)
        {
            velocityY = gravity;
        }
        applyVelocity();
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
    public void animationRight()
    {
        if(frame == 1 && onGround() == true)
        {
                setImage(run1r);
        }
        else if(frame == 2 && onGround() == true)
        {
                setImage(run2r);
        }   
        else if(frame == 3 && onGround() == true)
        {
                setImage(run3r);
        }
        else if(frame == 4 && onGround() == true)
        {
                setImage(run4r);
        }
        else if(frame == 5 && onGround() == true)
        {
                setImage(run5r);
        }
        else if(frame == 6 && onGround() == true)
        {
                setImage(run6r);
        }
        else if(frame == 7 && onGround() == true)
        {
                setImage(run7r);
        }
        else if(frame == 8 && onGround() == true)
        {
                setImage(run8r);
        }
        else if(frame == 9 && onGround() == true)
        {
                setImage(run9r);
        }
        else if(frame == 10 && onGround() == true)
        {
                setImage(run10r);
        }
        else if(frame == 1 && onGround() == true)
        {
                setImage(run11r);
                frame = 1;
        }
        frame ++;
    }
    public void animationLeft()
    {
        if(frame == 1 && onGround() == true)
        {
                setImage(run1l);
        }
        else if(frame == 2 && onGround() == true)
        {
                setImage(run2l);
        }   
        else if(frame == 3 && onGround() == true)
        {
                setImage(run3l);
        }
        else if(frame == 4 && onGround() == true)
        {
                setImage(run4l);
        }
        else if(frame == 5 && onGround() == true)
        {
                setImage(run5l);
        }
        else if(frame == 6 && onGround() == true)
        {
                setImage(run6l);
        }
        else if(frame == 7 && onGround() == true)
        {
                setImage(run7l);
        }
        else if(frame == 8 && onGround() == true)
        {
                setImage(run8l);
        }
        else if(frame == 9 && onGround() == true)
        {
                setImage(run9l);
        }
        else if(frame == 10 && onGround() == true)
        {
                setImage(run10l);
        }
        else if(frame == 1 && onGround() == true)
        {
                setImage(run11l);
                frame = 1;
        }
        frame ++;
    }
}
