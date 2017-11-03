

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void FormArmys(List<Tank> army1, List<Tank> army2, int length1, int length2) {

        int cs;
        int id=1;
        for(int i=0; i<length1; i++)
        {
            cs=(int)(Math.random()*4+1);
            switch (cs) {
                case 1:
                {
                    Tank cloned = TankCache.getTank("SoftTank");
                    cloned.SetName(cloned.GetName()+id++);
                    army1.add(cloned);
                    break;
                }
                case 2:
                {
                    Tank cloned = TankCache.getTank("MediumTank");
                    cloned.SetName(cloned.GetName()+id++);
                    army1.add(cloned);
                    break;
                }
                case 3:
                {
                    Tank cloned = TankCache.getTank("HeavyTank");
                    cloned.SetName(cloned.GetName()+id++);
                    army1.add(cloned);
                    break;
                }
                case 4:
                {
                    Tank cloned = TankCache.getTank("PTSAY");
                    cloned.SetName(cloned.GetName()+id++);
                    army1.add(cloned);
                    break;
                }
            }
        }
        for(int i=0; i<length2; i++)
        {
            cs=(int)(Math.random()*4+1);
            switch (cs) {
                case 1:
                {
                    Tank cloned = (Tank)TankCache.getTank("SoftTank");
                    cloned.SetName(cloned.GetName()+id++);
                    army2.add(cloned);
                    break;
                }
                case 2:
                {
                    Tank cloned = (Tank)TankCache.getTank("MediumTank");
                    cloned.SetName(cloned.GetName()+id++);
                    army2.add(cloned);
                    break;
                }
                case 3:
                {
                    Tank cloned = (Tank)TankCache.getTank("HeavyTank");
                    cloned.SetName(cloned.GetName()+id++);
                    army2.add(cloned);
                    break;
                }
                case 4:
                {
                    Tank cloned = (Tank)TankCache.getTank("PTSAY");
                    cloned.SetName(cloned.GetName()+id++);
                    army2.add(cloned);
                    break;
                }
            }


        }
    }
    static void LetsBattleBegin(List<Tank> army1, List<Tank> army2)
    {
        int count =0;

        int luck;
        int ind1;
        int ind2;

        Tank a;
        Tank b;

        StringBuilder ar1 = new StringBuilder();
        for(int i=0; i<army1.size(); i++)
            ar1.append(army1.get(i).GetName()+" ");
        System.out.println("Army 1 :   { "+ar1+"}\n");

        StringBuilder ar2 = new StringBuilder();
        for(int i=0; i<army2.size(); i++)
            ar2.append(army2.get(i).GetName()+" ");
        System.out.println("Army 2 :   { "+ar2+"}\n");


       while(true) {

           System.out.println(count);
           ind1 = (int)(Math.random()*(army1.size()-1));
           ind2 = (int)(Math.random()*(army2.size()-1));
           luck = (int)(Math.random()*100);
           if(count%2==0) {
               a = army1.get(ind1);
               b = army2.get(ind2);
           }
           else {
               b = army1.get(ind1);
               a = army2.get(ind2);
           }
           System.out.println(a.GetName()+" Try to shoot to "+b.GetName());
           if(a.GetAccuracy()<luck){
               System.out.println("Missed!\n");
           }
           else {
               if(a.GetPower()>=b.GetHP()) {
                   System.out.println(a.GetName()+" Killed tank "+b.GetName()+'\n');
                  if(count%2==0) army2.remove(b);
                  else army1.remove(b);
               }
               else {

                   System.out.println( b.GetName()+" -"+a.GetPower()+"hp"+'\n');
                   b.SetHP(b.GetHP()-a.GetPower());
               }
           }

           if(army2.isEmpty()) {System.out.println("First army wins!!!"); break;}

           if(army1.isEmpty()) {System.out.println("Second army wins!!!"); break;}

           count++;
       }
    }

    public static void main(String[] args) {

        TankCache.loadCache();
        int length1;
        int length2;

        Scanner in = new Scanner(System.in);

        List<Tank> army1 = new ArrayList<>();
        List<Tank> army2 = new ArrayList<>();

        System.out.println("How many tanks do you want to have in army1?");
        length1 = in.nextInt();
        System.out.println("in army2?");
        length2 = in.nextInt();

        FormArmys(army1, army2, length1, length2);


        LetsBattleBegin(army1, army2);

    }


}