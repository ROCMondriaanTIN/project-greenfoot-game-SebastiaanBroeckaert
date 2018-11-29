import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyY extends Mover
{
    private TileEngine tileEngine;
    public KeyY(TileEngine tileEngine)
    {
        this.tileEngine = tileEngine;
    }
    /**
     * Act - do whatever the KeyY wants to do. This method is called whenever
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
                    if(tile.type == TileType.YLOCK) {
                        tileEngine.removeTile(tile);
                    }
                }
                getWorld().removeObject(this);
                break;
            }
        }
    }    
}
