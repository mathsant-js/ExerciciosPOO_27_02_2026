package model;

public class Moto extends Veiculo{
    private String tipoGuidao;

    public Moto(String marca, String modelo, int ano, String tipoGuidao) {
        super(marca, modelo, ano);
        this.tipoGuidao = tipoGuidao;
    }

    public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public void exibirDados() {
        System.out.println(getMarca());
        System.out.println(getModelo());
        System.out.println(getAno());
        System.out.println(getTipoGuidao());
    }
}
