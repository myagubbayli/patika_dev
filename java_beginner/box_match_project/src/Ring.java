public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        double checkPercent = Math.random() * 100;
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("=========== NEW ROUND ===========");
                if (checkPercent >= 50.1 && checkPercent <= 100) {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                } else if (checkPercent <= 50) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                printScore();
            }
        } else {
            System.out.println("Weights of sportsmen are not matching!");
        }
    }

    public boolean checkWeight() {
        return ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight));
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Winner: " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Remeaning Health \t:" + f1.health);
        System.out.println(f2.name + " Remeaning Health \t:" + f2.health);
    }

}
