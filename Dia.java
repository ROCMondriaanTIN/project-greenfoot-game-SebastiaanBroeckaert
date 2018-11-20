import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dia extends Mover
{
    int diaCounter;
    public Dia()
    {
        super();
        setImage("gemBlue");
        diaCounter ++;
    }
    /**
     * Act - do whatever the Dia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        
        for(Actor hero : getIntersectingObjects(Hero.class))
        {
            if(hero != null)
            {
                getWorld().removeObject(this);
                break;
            }
        }
    }    
}
