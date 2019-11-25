import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Demo random walk
 * 
 * @author Rikard Karlsson  
 * @version 19-09-26
 */
public class Ant extends Actor
{
    public Ant()
    {
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    public void act() 
    {
        move(2);
        // 10% chance
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            int angel = Greenfoot.getRandomNumber(90) - 45;
            turn(angel);
        }
        if (isAtEdge())
        {
            turn(70 + Greenfoot.getRandomNumber(50));
        }
    }    
}
