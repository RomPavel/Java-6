public class Tank implements Cloneable{

    protected String name;
    protected int hp;
    protected int power;
    protected int accuracy;

    String GetName()
    {
        return this.name;
    }
    int GetHP()
    {
        return this.hp;
    }
    int GetPower()
    {
        return this.power;
    }
    int GetAccuracy()
    {
        return this.accuracy;
    }

    void SetHP(int hp)
    {
        this.hp=hp;
    }

    void SetName(String name)
    {
        this.name=name;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
