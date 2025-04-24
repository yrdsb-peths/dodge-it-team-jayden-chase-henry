import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skull extends Actor
{
    public Skull()
    {
        setImage("images/skull.png");
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            getWorld().removeObject(this);
        }
    }
}
