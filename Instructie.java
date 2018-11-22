import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructie extends World
{
    /**
     * Constructor for objects of class Instructie.
     * 
     */
    public Instructie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        prepare();
    }
    private void prepare()
    {
        Instr instr = new Instr();
        addObject(instr, 500, 400);
    }
}
