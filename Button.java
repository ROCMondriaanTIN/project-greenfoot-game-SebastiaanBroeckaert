import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Mover
{
    public void addedToWorld(World w)
    {
        getWorld();
    }
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        for(Actor badguy : getIntersectingObjects(BadGuy.class))
        {
            if(badguy != null)
            {
                //getWorld().chance("boxAlt.png");
                break;
            }
        }
    }    
}
