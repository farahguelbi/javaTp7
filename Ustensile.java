abstract class Ustensile {
    private int annee;
    public Ustensile(int a) {
        this.annee = a;
    }
public int getannee(){
   return annee;
}
public   double  calculer_Valeur(){
int age=2024-getannee();
if(age<50){
    return 0;
}else {
    return age-50;
}
}
}
