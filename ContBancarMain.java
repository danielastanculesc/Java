package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        //initializam obiecte de tip ContBancar
        //instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Dana S", "RO0001");
        ContBancar cont2 = new ContBancar("Ovidiu S", "RO0002");

        //apelam metoda descriere
        //cont1.descriere();
        //cont2.descriere();

        //activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);

        //alimentam conturi
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);


        //negativ testing, cheltuim mai mult decat avem
        cont1.plataCard(500); //nu se poate, 300.5 => pass

        //positiv testing - cu suma exacta
        cont1.plataCard(300.5);//rezultat = 0 => pass

        //positiv2
        cont2.plataCard(100);
        cont2.plataCard(200);//da - 700 lei >= pass


        cont1.InterogareSold();
        cont2.InterogareSold();

    }
}
