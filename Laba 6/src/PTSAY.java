public class PTSAY extends Tank{

    PTSAY()
    {
        this.name = "PTSAY";
        this.hp = (int)(Math.random()*20)+10;
        this.power=(int)(Math.random()*75)+50;
        this.accuracy=(int)(Math.random()*40)+60;
    }
    @Override
    public String toString()
    {
        return "name="+this.name+"; hp="+this.hp+"; power="+this.power+"; accuracy="+this.accuracy+"%";
    }
}