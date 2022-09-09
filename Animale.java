public class Animale{
   
    private String nome;
    private int eta;  // in anni
    private double peso; // in kg

    public Animale() { // costruttore di default
        nome = "Nessun nome";
        eta = 0;
        peso = 0;
    }

    public Animale(String nomeIniziale, int etaIniziale, double pesoIniziale) {
        nome = nomeIniziale;
        if((etaIniziale < 0) || (pesoIniziale < 0)) {
            System.out.println("Errore: età o peso negativi.");
            System.exit(0);
        } else {
            eta = etaIniziale;
            peso = pesoIniziale;
        }
    }

    public void setAnimale(String nuovoNome, int nuovaEta, double nuovoPeso) {
        nome = nuovoNome;
        if((nuovaEta < 0) || (nuovoPeso < 0)) {
            System.out.println("Errore: età o peso negativi.");
        } else {
            eta = nuovaEta;
            peso = nuovoPeso;
        }
    }

    public Animale(String nomeIniziale) {
        nome = nomeIniziale;
        eta = 0;
        peso = 0;
    }

    // START SETTER

    public void setNome(String nuovoNome) {
        nome = nuovoNome; // eta e peso rimangono invariate
    }

    public void setEta(int nuovaEta) {
        if(nuovaEta < 0) {
            System.out.println("Errore: età negativa.");
            System.exit(0);
        } else {
            eta = nuovaEta;
            // nome e peso rimangono invariate
        }
    }

    public void setPeso(double nuovoPeso) {
        if(nuovoPeso < 0) {
            System.out.println("Errore: peso negativo.");
            System.exit(0);
        } else {
            peso = nuovoPeso;
        }
    }

    // END SETTER

    public Animale(int etaIniziale) {
        nome = "Nessun nome";
        peso = 0;
        if(etaIniziale < 0) {
            System.out.println("Errore: età negativa.");
            System.exit(0);
        } else {
            eta = etaIniziale;
        }
    }

    public Animale(double pesoIniziale) {
        nome = "Nessun nome";
        eta = 0;
        if(pesoIniziale < 0 ) {
            System.out.println("Errore: peso negativo");
            System.exit(0);
        } else {
            peso = pesoIniziale;
        }
    }

    // START GETTER

    public String getNome(){
        return nome;
    }

    public int getEta(){
        return eta;
    }

    public double getPeso() {
        return peso;
    }

    // END GETTER

    public void scriviOutput() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
        System.out.println("Peso: " + peso + " kg");
    }

}

