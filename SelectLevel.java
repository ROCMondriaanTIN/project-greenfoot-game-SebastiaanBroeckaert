import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevel extends World
{
    /**
     * Constructor for objects of class SelectLevel.
     * 
     */
    public SelectLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("Select_Level.png");
        prepare();
    }
    private void prepare()
    {
        Een een = new Een();
        Twee twee = new Twee();
        Drie drie = new Drie();
        Vier vier = new Vier();
        Instructieknop ik = new Instructieknop();
        addObject(een, 150, 415);
        addObject(twee, 350, 415);
        addObject(drie, 550, 415);
        addObject(vier, 750, 415);
        addObject(ik, 435, 625);
    }
    public void act()
    {
        Hero.levelLevens = 0;
    }
}
