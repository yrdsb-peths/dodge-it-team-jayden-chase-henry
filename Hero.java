import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hero extends Actor
{
    int cooldown = 0;//prevents (mostly) repeated commands
    int position = 1;//prevents leaving the 3 paths
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
            if (cooldown == 0&&position > 1)
            {
                setLocation(getX(), getY()-100);
                cooldown = 10;
                position--;
            }
        }
        else if (Greenfoot.isKeyDown("down")||(Greenfoot.isKeyDown("s")))
        {
            if (cooldown == 0&&position < 3)
            {
                setLocation(getX(), getY()+100);
                cooldown = 10;
                position++;
            }
        }
    }
}
