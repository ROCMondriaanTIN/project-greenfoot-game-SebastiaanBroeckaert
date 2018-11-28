import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyBlue extends Mover
{
    private TileEngine tileEngine;
    public KeyBlue(TileEngine tileEngine)
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
        for(Actor hero : getIntersectingObjects(Hero.class))
        {
            if(hero != null)
            {
                for(Tile tile: getWorld().getObjects(Tile.class)) {
                    if(tile.type == TileType.BLOCK) {
                        tileEngine.removeTile(tile);
                    }
                }
                getWorld().removeObject(this);
                break;
            }
        }
    }   
}
