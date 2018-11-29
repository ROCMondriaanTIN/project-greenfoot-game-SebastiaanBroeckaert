import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sorry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sorry extends Mover
{
    /**
     * Act - do whatever the Sorry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        setImage(new GreenfootImage("Sorry Pink Eye," +
        " maar ik vertrouw je niet.", 24, Color.GREEN, Color.WHITE));
    }    
}
