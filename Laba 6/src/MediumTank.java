class MediumTank extends Tank{

    MediumTank()
    {
        this.name = "MediumTank";
        this.hp = (int)(Math.random()*30)+30;
        this.power=(int)(Math.random()*25)+25;
        this.accuracy=(int)(Math.random()*30)+30;
    }
    @Override
    public String toString()
    {
        return "name="+this.name+"; hp="+this.hp+"; power="+this.power+"; accuracy="+this.accuracy+"%";
    }
}

