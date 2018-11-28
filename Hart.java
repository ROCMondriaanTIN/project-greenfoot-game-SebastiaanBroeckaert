import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hart extends Actor
{
    /**
     * Act - do whatever the hart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Levens: " + Hero.leven, 24, Color.RED, Color.BLACK));
    }    
}
