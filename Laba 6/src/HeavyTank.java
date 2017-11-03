public class HeavyTank extends Tank{

    HeavyTank()
    {
        this.name = "HeavyTank";
        this.hp = (int)(Math.random()*40)+60;
        this.power=(int)(Math.random()*25)+25;
        this.accuracy=(int)(Math.random()*20)+10;
    }
    @Override
    public String toString()
    {
        return "name="+this.name+"; hp="+this.hp+"; power="+this.power+"; accuracy="+this.accuracy+"%";
    }
}
