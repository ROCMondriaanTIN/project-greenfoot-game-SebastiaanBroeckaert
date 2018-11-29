import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dia extends Mover
{
    static int diaCounter;
    public void addedToWorld(World w)
    {
        getWorld();
    }
    public Dia()
    {
        super();
        setImage("gemBlue.png");
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
                Punten.scoreToevoegenDia();
                diaCounter ++;
                getWorld().removeObject(this);
            }
            if(diaCounter == 9)
            {
                Greenfoot.setWorld(new BonusEen());
            }
        }
    }    
}
