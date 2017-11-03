import java.util.Hashtable;

public class TankCache {
    private static Hashtable<String, Tank> tankMap = new Hashtable<>();

    public static Tank getTank(String shapeId) {
        Tank cachedTank = tankMap.get(shapeId);
        return (Tank) cachedTank.clone();
    }
    public static void loadCache() {
        SoftTank st = new SoftTank();
        tankMap.put(st.GetName(),st);

        MediumTank mt = new MediumTank();
        tankMap.put(mt.GetName(),mt);

        HeavyTank ht = new HeavyTank();
        tankMap.put(ht.GetName(), ht);

        PTSAY ptsay = new PTSAY();
        tankMap.put(ptsay.GetName(), ptsay);
    }
 }
