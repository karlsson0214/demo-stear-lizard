import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world with ants and a hunting lizard.
 * 
 * @author Rikard Karlsson  
 * @version 19-09-26
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lizard lizard = new Lizard();
        addObject(lizard,228,213);
        Ant ant = new Ant();
        addObject(ant,395,118);
        Ant ant2 = new Ant();
        addObject(ant2,391,202);
        Ant ant3 = new Ant();
        addObject(ant3,527,253);
        Ant ant4 = new Ant();
        addObject(ant4,511,333);
        Ant ant5 = new Ant();
        addObject(ant5,503,108);
        Ant ant6 = new Ant();
        addObject(ant6,249,58);
        Ant ant7 = new Ant();
        addObject(ant7,147,129);
        Ant ant8 = new Ant();
        addObject(ant8,97,268);
        Ant ant9 = new Ant();
        addObject(ant9,330,333);
        Ant ant10 = new Ant();
        addObject(ant10,211,363);
    }
}
