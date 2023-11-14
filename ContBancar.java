package oop;

public class ContBancar {
    // program file = definim logica unui cont bancar

    // oop = object oriented programming
    // poo = programare orientata pe obiect

    // o clasa = este un tip nou
    // este definitia unui concept
    //ex: clasa = reteta la paste carbonara, adn uman
    // ex : clasa Car

    // un obiecte = instanta unei clase, implementarea clasei
    //ex: paste carbonara, un om
    //ex: obiect de tip Car

    //fields = proprietati = atribute
    // sunt de fapt variabile
    // ex: variabile = culoare, marca, model, consum, pret, esteOprita

    //metode = actiuni ce pot fi facute de obiecte
    //de fapt sunt functii
    //ex: accelereaza(), franeaza(), deschide usa()

    // proprietati, fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercare_activare = 0;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare, required fields
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    //metode = actiunile clasei
    public void InterogareSold() {
        System.out.println("Titular " + this.titularCont);
        System.out.println("Activ " + this.activ);
        System.out.println("Sold " + this.sold);
        System.out.println("IBAN " + this.iban);
        System.out.println("ne de incercari gresite " + this.incercare_activare);
        System.out.println("-------------------------------------------");
    }

    public void activareCont(int pinUtilizator) {
        //modificare activ in true doar daca pinul e corect
        System.out.println("Buna" + this.titularCont);
        if (pinUtilizator == this.pin){
            System.out.println("Cont activat cu succes");
            this.activ = true;
        } else {
            System.out.println("Pin gresit");
            this.incercare_activare++; //incrementeasa

        }


    }

    public void alimentareCont(double suma_depusa) {
        // la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Buna" + this.titularCont);
        System.out.println("Depunere cu succes suma de: " + suma_depusa + "Aveti in cont suma de " + this.sold);
    }

    public void plataCard(double suma_cheltuita) {
        System.out.println("Buna" + this.titularCont);
        //pot sa cheltuiesc doar ce am
        //daca suma cheltuita <= sold
        if (suma_cheltuita <= this.sold){
            //dispar banii din cont - se modifica soldul
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit: " + suma_cheltuita);
            System.out.println("Mai ai: " + this.sold);
        } else {
            System.out.println("nu mai ai fonduri");

        }

    }
}
