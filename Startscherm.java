import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscherm extends World
{
    int tijd = 0;
    /**
     * Constructor for objects of class startscherm.
     * 
     */
    public Startscherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        Greenfoot.start();
        this.setBackground("Startscherm.png");
    }
    public void act()
    {
        tijd ++;
        if(tijd >= 10 && Greenfoot.isKeyDown("space"))
        {
            Hero.leven = 3;
            Dia.diaCounter = 0;
            Punten.punten = 0;
            Greenfoot.setWorld(new Instructie());
        }
    }
}
