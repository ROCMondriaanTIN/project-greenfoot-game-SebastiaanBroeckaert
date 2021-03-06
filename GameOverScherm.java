import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScherm extends World
{
    /**
     * Constructor for objects of class GameOverScherm.
     * 
     */
    public GameOverScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        addObject(new Punten(), 500, 400);
        this.setBackground("Game_Over.png");
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Startscherm());
        }
    }
}
