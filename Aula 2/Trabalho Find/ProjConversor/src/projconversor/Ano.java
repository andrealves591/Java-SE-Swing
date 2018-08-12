package projconversor;

public class Ano {

    private int ano;

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int converterAnoEmMeses() {
        return this.ano * 12;
    }

    public int converterAnoEmSemanas() {
        return this.ano * 52;
    }

    public int converterAnoEmDias() {
        return this.ano * 365;
    }

    public int converterAnoEmHoras() {
        return this.ano * 8766;
    }

    public int converterAnoEmMinutos() {
        return this.ano * 525960;
    }

    public int converterAnoEmSegundos() {
        return this.ano * 31536000;
    }

    @Override
    public String toString() {
        return "O ano informado foi " + this.ano + "\n"
                + "Meses: " + this.converterAnoEmMeses() + "\n"
                + "Semanas: " + this.converterAnoEmSemanas() + "\n"
                + "Dias: " + this.converterAnoEmDias() + "\n"
                + "Horas: " + this.converterAnoEmHoras() + "\n"
                + "Minutos: " + this.converterAnoEmMinutos() + "\n"
                + "Segundos: " + this.converterAnoEmSegundos() + "\n";
    }

}
