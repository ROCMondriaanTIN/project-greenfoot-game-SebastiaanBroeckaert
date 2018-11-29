import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChitChat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChitChat extends World
{
    int tijd = 0;
    /**
     * Constructor for objects of class ChitChat.
     * 
     */
    public ChitChat()
    {    
        super(1000, 800, 1); 
        
    }
    public void act()
    {
        tijd ++;
        if(tijd >= 10 && Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new LevelExtra());
        }
    }
}
