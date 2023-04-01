public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista(); 
        System.out.println("list: \n" + lista);
        for (int i = 10; i < 100; i += 20) {
            lista.insert(i);
            lista.insertEnd(i+10);
            System.out.println(lista);
        }
        while(!lista.isEmpty()) {
            System.out.println(lista.remove() + " saiu do inicio ");
            System.out.println(lista.removeEnd() + " saiu do final ");
            System.out.println(lista);
        }
    }
}