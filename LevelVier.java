import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelVier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelVier extends World
{
    private CollisionEngine ce;
    private TileEngine te;
    /**
     * Constructor for objects of class LevelVier.
     * 
     */
    public LevelVier()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1,false);
        this.setBackground("4_Bg.png");

        int[][] map = {
           {28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,173,173,173,173,173,173,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28},
{68,68,173,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,127,127,127,127,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,28,28,28,28,28},
{67,67,173,-1,-1,170,-1,-1,-1,169,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,74,74,74,74,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,28,28,28,28,28},
{67,67,173,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,74,74,74,74,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,28,28,28,28,28},
{67,67,173,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,-1,-1,-1,13,-1,-1,74,74,74,74,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,13,28,28,28,28,28},
{45,45,45,45,45,45,45,45,45,45,45,45,45,45,-1,-1,-1,127,127,127,6,6,6,6,127,127,127,127,45,45,45,-1,-1,-1,45,45,45,28,28,28,28,28},
{28,28,28,28,28,28,28,28,28,28,28,28,28,28,-1,-1,-1,6,6,6,6,6,6,6,6,6,6,6,28,28,28,-1,-1,-1,28,28,28,28,28,28,28,28},
{28,28,28,28,28,28,28,28,28,28,28,28,28,28,-1,-1,-1,6,6,6,6,6,6,6,6,6,6,6,28,28,28,-1,-1,-1,28,28,28,28,28,28,28,28},
{28,28,28,28,28,28,28,28,28,28,28,28,28,28,-1,-1,-1,6,6,6,6,6,6,6,6,6,6,6,28,28,28,-1,-1,-1,28,28,28,28,28,28,28,28},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,6,6,6,6,6,6,6,6,6,6,6,151,151,151,151,151,151,151,151,151,151,151,151,151,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,6,6,6,6,6,6,6,6,6,6,6,151,151,151,151,151,151,151,151,151,151,151,151,151,151},
{173,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,100,100,100,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151},
{173,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,100,100,100,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151},
{173,-1,-1,-1,-1,170,-1,-1,-1,169,-1,-1,-1,-1,-1,-1,-1,100,100,100,-1,-1,-1,-1,-1,170,-1,-1,-1,-1,-1,-1,-1,-1,-1,169,-1,-1,-1,-1,-1,151},
{173,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,100,100,100,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151},
{173,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,100,100,100,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151},
{166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,11,11,166,11,11,11,166,11,11,166,166,95,95,95,95,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,10,10,151,10,10,10,151,10,10,151,151,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,10,10,151,10,10,10,151,10,10,151,151,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,10,10,151,10,10,10,151,10,10,151,151,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,10,10,151,10,10,10,151,10,10,151,151,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,10,10,151,10,10,10,151,10,10,151,151,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,10,10,151,10,10,10,151,10,10,151,151,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,-1,94,94,94,94,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,-1,166,166,166,166,166,166,166,166,103,103,103,103,103,151},
{151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,166,151,151,151,151,151,151,151,151,103,103,103,103,103,151},
{151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,170,-1,-1,169,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,166,151,151,151,151,151,151,151,151,151,103,103,103,103,103,151},
{151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,166,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,151},
{151,-1,-1,-1,-1,-1,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,166,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,151},
{151,102,102,102,102,102,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,151},
{151,102,102,102,102,102,-1,-1,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,2,2,2,2,2,151},
{151,102,102,102,102,102,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151,151,151,151,151,-1,-1,-1,-1,-1,151},
{151,74,74,6,6,6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,13,151,151,151,151,151,-1,-1,-1,-1,-1,151},
{151,74,74,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,151,151,151,151,151,-1,-1,-1,-1,-1,151},
{151,-1,-1,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,151,151,151,151,151,-1,-1,-1,-1,-1,151},
{151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,151,-1,-1,-1,-1,-1,151},
{151,101,101,101,101,101,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151},
{151,101,101,-1,-1,101,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151},
{151,101,-1,101,101,-1,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151},
{151,101,-1,101,101,-1,101,-1,-1,-1,170,-1,-1,-1,169,-1,-1,-1,-1,170,-1,-1,-1,169,-1,-1,-1,-1,-1,170,-1,-1,-1,169,-1,-1,-1,-1,-1,-1,-1,151},
{151,101,101,-1,-1,101,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,151},
{151,101,101,101,101,101,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,13,151},
{151,95,95,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,166,151},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,106,-1,-1,106,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,95,-1,-1,-1,-1,-1,-1,-1,-1,81,82,82,83,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6},
{6,94,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,85,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,127,-1,-1,6},
{6,94,94,71,71,71,71,71,71,71,71,71,71,71,84,85,6,94,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,127,127,127,6,71,71,6},
{6,8,8,8,8,8,8,8,8,8,8,8,8,8,6,6,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,6,6,6,6,8,8,6},

        };
        

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
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
        Dia dia1 = new Dia();
        Dia dia2 = new Dia();
        //Declareren en initialiseren van de leven klassen
        Leven up1 = new Leven();
        Leven up2 = new Leven();
        Leven up3 = new Leven();
        Bob b = new Bob();
        // Creeer een scoreboard
        Punten pu = new Punten();
        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 220, 255);
        addObject(new Enemy(), 80, 260);
        addObject(new Enemy(), 2005, 500);
        addObject(new Enemy(), 1925, 500);
        addObject(new Enemy(), 870, 2065);
        addObject(new Enemy(), 1845, 2845);
        addObject(new Enemy(), 1305, 2845);
        addObject(new Enemy(), 755, 2845);
        addObject(dia1, 2120, 255);
        addObject(dia2, 130, 2415);
        addObject(up1, 915, 915);
        addObject(up2, 1055, 2295);
        addObject(up3, 1200, 2835);
        addObject(b, 2130, 3255);
        addObject(pu, 830, 45);
        addObject(new Hart(), 170, 45);
        addObject(new Vlag(), 220, 260);
        addObject(new Vlag(), 2046, 1760);
        addObject(new KeyBlue(te), 120, 915);
        addObject(new KeyG(te), 490, 2835);
        addObject(new KeyR(te), 290, 2055);
        addObject(new KeyY(te), 1760, 2295);
        
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
