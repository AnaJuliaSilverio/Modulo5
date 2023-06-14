package aulaTest37.exercicio2;

public class DiaDaSemana {

    public String diaSemana(int dia){
        dia = dia%7;
        switch (dia) {
            case 0 -> {
                return "Domingo.Melhor dia de ir na feira!";
            }
            case 1 -> {
                return "Segunda";
            }
            case 2 -> {
                return "Terça";
            }
            case 3 -> {
                return "Quarta";
            }
            case 4 -> {
                return "Quinta";
            }
            case 5 -> {
                return "Sexta";
            }
            case 6 -> {
                return "Sábado";
            }
            default ->{
                return "Dia Inválido";
            }
        }
    }
}
