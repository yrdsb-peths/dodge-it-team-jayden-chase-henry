import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hero extends Actor
{
    public Hero()
    {
        setImage("images/ppl1.png");
    }
    public void act()
    {
        
        if(Greenfoot.isKeyDown("up")||(Greenfoot.isKeyDown("w")))
        {
            setLocation(100,100);
        }
        else if (Greenfoot.isKeyDown("down")||(Greenfoot.isKeyDown("s")))
        {
            setLocation(100,300);
        }
    }
}
