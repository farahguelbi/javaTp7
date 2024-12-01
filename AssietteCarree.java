public class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    @Override
    double CalculerSurfaceAssiette() {
        return cote* cote;
    }
    @Override 
       public double calculer_Valeur(){
        return  super.calculer_Valeur()*5;
                 
       
    }
}