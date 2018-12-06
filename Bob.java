import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bob extends Mover
{
    /**
     * Act - do whatever the Bob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("p1.png");
        getImage().mirrorHorizontally();
        applyVelocity();
        for(Actor hero : getIntersectingObjects(Hero.class))
        {
            if(hero != null && Hero.levelLevens == 3)
            {
                Greenfoot.setWorld(new ChitChat());
            }
        }
    }    
}
