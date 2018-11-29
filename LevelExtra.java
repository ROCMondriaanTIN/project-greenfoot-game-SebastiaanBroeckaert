import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelExtra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelExtra extends World
{
    private CollisionEngine ce;
    private TileEngine te;
    /**
     * Constructor for objects of class LevelExtra.
     * 
     */
    public LevelExtra()
    {    
        super(1000, 800, 1,false);
        this.setBackground("4_Bg.png");
        
        int[][] map = {
           {151,101,101,101,101,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,13,151,-1,-1,-1,-1,-1,-1},
{151,95,95,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,151,6,6,6,6,6,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,106,-1,-1,106,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,95,-1,-1,-1,-1,-1,-1,-1,-1,81,82,82,83,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,85,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,127,-1,-1,6,-1,-1,-1,-1,68,6},
{6,94,94,71,71,71,71,71,71,71,71,71,71,71,84,85,6,94,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,127,127,127,6,71,71,6,-1,6,6,6,67,6},
{6,8,8,8,8,8,8,8,8,8,8,8,8,8,6,6,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,6,6,6,6,8,8,6,8,8,8,8,8,6},

        };
        TileEngine te = new TileEngine(this, 60, 60, map);
        te.setTileFactory(new TileFactory());
        te.setMap(map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        ce = new CollisionEngine(te, camera);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero(ce, te);
        //Declareren en initialiseren van de dia klassen
        Dia dia = new Dia();
        //Declareren en initialiseren van de leven klassen
        Leven up1 = new Leven();
        // Creeer een scoreboard
        Punten pu = new Punten();
        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);
        
        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 2040, 495);
        addObject(dia, 1675, 315);
        addObject(up1, 2785, 435);
        addObject(pu, 830, 45);
        addObject(new Hart(), 170, 45);
        addObject(new Sorry(), 2665, 200);
        
        // Force act zodat de camera op de juist plek staat.
        camera.act();
        hero.act();
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
    @Override
    public void act() {
        ce.update();
    }
}
