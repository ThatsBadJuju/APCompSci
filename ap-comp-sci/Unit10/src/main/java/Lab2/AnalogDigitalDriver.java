package Lab2;

import java.util.ArrayList;

public class AnalogDigitalDriver {
    public static void main(String[] args) {

        ArrayList<TV> tvs = new ArrayList<>();
        BWTV bwtv = new BWTV();
        HDTV hdtv = new HDTV();

        tvs.add(bwtv);
        tvs.add(hdtv);

        bwtv.setTvOn(false);
        hdtv.setTvOn(false);

        for(TV tv : tvs) {
            System.out.println(tv.tvType() + "... Am I on? " + tv.isTvOn());
        }

        for(int i = 0; i < tvs.size(); i++) {
            tvs.get(i).setTvOn(true);
        }
        System.out.println();

        for(TV tv : tvs) {
            System.out.println(tv.tvType() + "... Am I on? " + tv.isTvOn());
        }

        System.out.println();
        System.out.println(bwtv.rotateRabbitEars());
        System.out.println(hdtv.connectHDMI());
    }
}
