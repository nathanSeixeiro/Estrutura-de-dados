import java.util.Random;

class Ojogo {
    public static void main(String [] args) {
        Random r = new Random();
        Lista l = new Lista();

        do {
            if(r.nextInt(2) == 0) {
                if (r.nextInt(2) == 0) l.insert(r.nextInt(10));
                else l.insertEnd(r.nextInt(10));
            } else {
                if (!l.isEmpty()) {
                    if(r.nextInt(2) == 0) System.out.println(l.remove() + " saiu do inicio ");
                    else System.out.println(l.removeEnd() + " saiu do fim ");
                }                
            }
            System.out.println(l);
        } while (!l.isEmpty());
        System.out.println("Game Over");
    }
}