public class Main {
    public static void main(String[] args) throws Exception {
        Boutique boutique1 = new Boutique();
        boutique1.ajouter(new Produit(1, 2121.2));
        boutique1.ajouter(new Produit(2, 2121.2, 238.32));
        boutique1.enregistrer("src\\data.txt");
    }
}