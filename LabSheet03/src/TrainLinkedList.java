public class TrainLinkedList {
    public static void main(String[] args) {
        LinkedList greenline = new LinkedList();

        greenline.insert("Mo-chit");
        greenline.insert("Ari");
        greenline.insert("Sanam-Pao");

        System.out.println("All stations : " + greenline.traversal());

        greenline.insert(2, "Rachakru");
        System.out.println("All stations : " + greenline.traversal());

        System.out.println("Total stations : " + greenline.length());
        System.out.println("First station : " + greenline.get(0));

        greenline.set(0, "Mo-chit (Central Ladprao)");
        System.out.println("All stations : " + greenline.traversal());

        greenline.remove(2);
        System.out.println("All stations : " + greenline.traversal());

        greenline.removeLastElement();
        System.out.println("All stations : " + greenline.traversal());

        greenline.clear();
        System.out.println("Total stations : " + greenline.length());
        System.out.println("All stations : " + greenline.traversal());
    }
}
