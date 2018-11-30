import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Mover
{
    private TileEngine tileEngine;
    public Button(TileEngine tileEngine)
    {
        this.tileEngine = tileEngine;
    }
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        for(Actor badguy : getIntersectingObjects(BadGuy.class))
        {
            if(badguy != null)
            {
                Greenfoot.playSound("floop2_x.wav");
                for(Tile tile: getWorld().getObjects(Tile.class)) {
                    if(tile.type == TileType.BOX) {
                        tileEngine.removeTile(tile);
                        setImage("buttonRed_pressed.png");
                    }
                }
                break;
            }
        }
    }    
}
