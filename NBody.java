public class NBody {

    public static double readRadius(String path) {
        In in = new In(path);
        int nP = in.readInt();
        double uR = in.readDouble();
        return uR;
    }

    public static Planet[] readPlanets(String path) {
        In in = new In(path);
        int nP = in.readInt();
        double uR = in.readDouble();
        Planet[] gPlanet = new Planet[nP];
        while (nP > 0) {
            double xP = in.readDouble(),
                   yP = in.readDouble(),
                   xV = in.readDouble(),
                   yV = in.readDouble(),
                   m = in.readDouble();
            String img = in.readString();
            //System.out.println(xP + " " + yP + " " + xV + " " + yV + " " + m + " " + img);
            //Planet P = new Planet(xP, yP, xV, yV, m, img);
            Planet P = new Planet(1, 1, 1, 1, 1, "w");
            System.out.println(P.imgFileName);
            gPlanet[nP - 1] = P;
            nP -= 1;
        }
        return gPlanet;
    }

    public static void main(String[] args) {
        Planet[] PP = readPlanets("./data/planets.txt");
        /*for (Planet i : PP) {
            System.out.println(i.imgFileName);
        }*/
    }
}
