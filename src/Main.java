public class Main {
    public static void main(String[] args) {

            Fighter marc = new Fighter("Can", 10, 80, 60, 50);
            Fighter alex = new Fighter("Mete", 15, 95, 90, 30);
            Match r = new Match(marc, alex, 60, 100);
            r.run();
        }
    }
