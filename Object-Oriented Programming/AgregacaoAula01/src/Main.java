import java.util.ArrayList;

public class Main {
    public static void main(String[] args){


        Estadio arenaSenac = new Estadio("Arena Senac", "Maringá");
        ArrayList<SocioTorcedor> listaSocioTorcedor = new ArrayList<>();

        listaSocioTorcedor.add(new SocioTorcedor("Thyago", "Junior"));
        listaSocioTorcedor.add(new SocioTorcedor("Ronie", "Senior"));

        Time senacMaringa = new Time("Senac Maringá", arenaSenac, listaSocioTorcedor.get(1));

        System.out.println(senacMaringa);
    }

}
