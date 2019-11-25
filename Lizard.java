import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Lizard that eat Ants.
 * 
 * Steared with left and right keys.
 * 
 * @author Rikard Karlsson  
 * @version 19-09-26
 */
public class Lizard extends Actor
{
    private int score = 0;
    
    public void act() 
    { 
        move(4);
        checkKeyboard();
        tryEat();
    }  
    
    private void tryEat()
    {
        if (isTouching(Ant.class))
        {
            removeTouching(Ant.class);
            addPoint();
        }
    }
    
    private void checkKeyboard()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
    }
    
    private void addPoint()
    {
        score = score + 1;
        getWorld().showText("Score: " + score, 100, 50); 
    }
}

