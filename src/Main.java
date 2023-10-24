
public class Main {
    public static void main(String[] args) {
        SuperHero superPepe = new SuperHero(100, 100);
        System.out.println("pepe el super pepe lucha por la justica");
        superPepe.setNombreHeroe("SuperPepe");
        superPepe.Poder(superPepe.getEnergia());

        System.out.println("Salud después de usar superpoderes: " + superPepe.getSalud());
        System.out.println("Energía después de usar superpoderes: " + superPepe.getEnergia());
    }
}