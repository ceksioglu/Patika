package week2;

public class Boxing {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike",25,200,100);
        Fighter f2 = new Fighter("Evander",20,200,100);

        Match match = new Match(f1,f2,90,110);
        match.run();

    }

    public static class Fighter{
        String name;
        int damage;
        int health;
        int weight;

        Fighter(String name, int damage, int health, int weight){
            this.name = name;
            this.damage = damage;
            this.health = health;
            this.weight = weight;
        }

        int hit(Fighter foe){
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar verdi!");
            if(foe.health - this.damage < 0){
                return 0;
            }
            return foe.health - this.damage;
        }

    }
    public static class Match {
        Fighter f1;
        Fighter f2;
        int minWeight;
        int maxWeight;

        Match(Fighter f1, Fighter f2, int minWeight,int maxWeight){
            this.f1 = f1;
            this.f2 = f2;
            this.maxWeight = maxWeight;
            this.minWeight = minWeight;
        }

        public void run(){
            if(isCheck()){
                while(this.f1.health > 0 && this.f2.health > 0){

                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(f2.name + " kalan canı: " +f2.health);
                    if (isWin()){
                        break;
                    }

                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(f1.name + " kalan canı: " +f1.health);
                    if (isWin()){
                        break;
                    }

                }
            } else {
                System.out.println("Sporcuların sikletleri uymuyor.");
            }
        }
        boolean isCheck(){
            return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
        }

        boolean isWin(){
            if (this.f1.health == 0){
                System.out.println(this.f2.name+ " kazandı!");
                return true;
            }
            if (this.f2.health == 0){
                System.out.println(this.f1.name + " kazandı!");
                return true;
            }
            return false;
        }
    }

}
