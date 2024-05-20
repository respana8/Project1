public class Main {
    public static void main(String[] args) {
        // lECTURA XML
        String rutaArma = "C:\\Users\\ESPARTA\\Desktop\\PROJECT3\\armes.xml";
        String rutaArmadura = "C:\\Users\\ESPARTA\\Desktop\\PROJECT3\\armadures.xml";
        String rutaPocio = "C:\\Users\\ESPARTA\\Desktop\\PROJECT3\\pocions.xml";

        // CREAR PERSONATGES
        Personatge1 personatge1 = new Personatge1("Gandalf", 10, 100, 150, 0);
        Personatge2 personatge2 = new Personatge2("Aragorn", 8, 120, 80, 0);

        // EQUIPAMENT
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("############ INICI DEL JOC  ##############");
        System.out.println("##########################################");
        System.out.println("##########################################");
        personatge1.equiparPersonatge1("Espasa de foc", 30, "Elmo de ferro", 50, "Poció de vida", 30, 0);
        personatge2.equiparPersonatge2("Daga enverinada", 25, "Corassa de cuir", 40, "Poció de mana", 0, 50);

        // ESTADÍSTIQUES DINALS
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("Dades finals dels personatges:");
        System.out.println("Vida i mana de " + personatge1.getNom() + ": " + personatge1.getPuntsDeVida() + " HP, " + personatge1.getPuntsDeMana() + " MP");
        System.out.println("Vida i mana de " + personatge2.getNom() + ": " + personatge2.getPuntsDeVida() + " HP, " + personatge2.getPuntsDeMana() + " MP");

        // LLUITA
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("######## PERSONA 1 VS. PERSONA 2 #########");
        System.out.println("##########################################");
        System.out.println("##########################################");
        while (personatge1.getPuntsDeVida() > 0 && personatge2.getPuntsDeVida() > 0) {
            int danysPersonatge1 = personatge1.danys;
            System.out.println(personatge1.nom + " ataca a " + personatge2.nom + " i li fa " + danysPersonatge1 + " de danys.");
            personatge2.puntsDeVida -= danysPersonatge1;
            if (personatge2.puntsDeVida <= 0) {
                System.out.println(personatge2.nom + " DEP");
                System.out.println("##########################################");
                System.out.println("##########################################");
                System.out.println("PERSONA 1 GUANYA");
                break;
            }
            int danysPersonatge2 = personatge2.danys;
            System.out.println(personatge2.nom + " ataca a " + personatge1.nom + " i li fa " + danysPersonatge2 + " de danys.");
            personatge1.puntsDeVida -= danysPersonatge2;
            if (personatge1.puntsDeVida <= 0) {
                System.out.println(personatge1.nom + " DEP");
                System.out.println("##########################################");
                System.out.println("##########################################");
                System.out.println("PERSONA 2 GUANYA");
                break;
            }
        }
    }
}
