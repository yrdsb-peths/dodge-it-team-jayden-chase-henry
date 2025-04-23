import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hero extends Actor
{
    int cooldown = 0;
    public Hero()
    {
        setImage("images/ppl1.png");
    }
    public void act()
    {
        if (cooldown > 0)
        {
            cooldown --;
        }
        
        if(Greenfoot.isKeyDown("up")||(Greenfoot.isKeyDown("w")))
        {
            if (cooldown == 0)
            {
                setLocation(getX(), getY()-100);
                cooldown = 10;
            }
        }
        else if (Greenfoot.isKeyDown("down")||(Greenfoot.isKeyDown("s")))
        {
            if (cooldown == 0)
            {
                setLocation(getX(), getY()+100);
                cooldown = 10;
            }
        }
    }
}
