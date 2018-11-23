import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Mover
{
    private CollisionEngine collisionEngine;
    private TileEngine tileEngine;
    public Button()
    {
        this.collisionEngine = collisionEngine;
        this.tileEngine = tileEngine;
    }
    public void addedToWorld(World w)
    {
        getWorld();
    }
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        List<Tile> tiles = collisionEngine.getCollidingTiles(this, true);
        for(Actor badguy : getIntersectingObjects(BadGuy.class))
        {
            if(badguy != null)
            {
                if (tile.type == TileType.BOX)
                {
                    tileEngine.removeTile(Tile);
                }
                break;
            }
        }
    }    
}
