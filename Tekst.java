import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tekst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tekst extends Mover
{
    /**
     * Act - do whatever the Tekst wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        setImage(new GreenfootImage("Three Eye ontvoerde Bob, ik moet hem redden."
        + " Hij is vast naar zijn kasteel.", 24, Color.PINK, Color.WHITE));
    }    
}
