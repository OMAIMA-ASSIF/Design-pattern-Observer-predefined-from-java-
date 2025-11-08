public class StationMeteo {
    public static void main(String[] args) {
        // Création de l'observable (sujet)
        DonneesMeteo donneesMeteo = new DonneesMeteo();
        
        // Création des observateurs qui s'enregistrent automatiquement
        AffichageConditions affichageCond = new AffichageConditions(donneesMeteo);
        AffichagePrevisions affichagePrev = new AffichagePrevisions(donneesMeteo);
        
        // Simulation des mesures météorologiques
        System.out.println("=== STATION MÉTÉO - DÉBUT ===");
        
        System.out.println("\n--- Mesure 1 ---");
        donneesMeteo.setMesures(25.0f, 65.0f, 1015.0f);
        
        System.out.println("\n--- Mesure 2 ---");
        donneesMeteo.setMesures(26.5f, 70.0f, 1012.0f);
        
        System.out.println("\n--- Mesure 3 ---");
        donneesMeteo.setMesures(23.0f, 90.0f, 1008.0f);
        
        System.out.println("\n--- Mesure 4 ---");
        donneesMeteo.setMesures(22.0f, 95.0f, 1018.0f);
        
        System.out.println("\n=== STATION MÉTÉO - FIN ===");
    }
}