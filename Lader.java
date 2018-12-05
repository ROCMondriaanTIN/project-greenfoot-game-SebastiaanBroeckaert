import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lader extends Tile
{
    public boolean isSolid = false;
    private static int id;
    public int _id;
    public Lader(String image, int width, int heigth, TileType type)
    {
        super(image, width, heigth, TileType.LADER);
        setImage(image);
        getImage().scale(width, heigth);
        if(CollisionEngine.DEBUG)
        {
            getImage().drawString("ÃD: " + id, 10, 10);
        }
        _id = id;
        id++;
    }    
}
