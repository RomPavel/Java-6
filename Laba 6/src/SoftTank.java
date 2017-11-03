class SoftTank extends Tank
{
    SoftTank()
    {
        this.name = "SoftTank";
        this.hp = (int)(Math.random()*20)+10;
        this.power=(int)(Math.random()*20)+5;
        this.accuracy=(int)(Math.random()*30)+30;
    }
    @Override
    public String toString()
    {
        return "name="+this.name+"; hp="+this.hp+"; power="+this.power+"; accuracy="+this.accuracy+"%";
    }

}

