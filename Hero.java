import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hero extends Actor
{
    int cooldown = 0;//prevents (mostly) repeated commands
    int cooldownOld = 0;
    int position = 1;//prevents leaving the 3 paths
    public Hero()
    {
        setImage("images/ppl1.png");
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("up")||(Greenfoot.isKeyDown("w")))
        {
            cooldown = 1;
            if(position > 1 && cooldown != cooldownOld)
            {
                    setLocation(getX(), getY()-100);
                    position--;
            }
        }
        else if (Greenfoot.isKeyDown("down")||(Greenfoot.isKeyDown("s")))
        {
            cooldown = 1;
            if(position < 3 && cooldown != cooldownOld)
            {
                    setLocation(getX(), getY()+100);
                    position++;
            }
        }
        cooldownOld = cooldown;
        cooldown = 0;
    }
}
