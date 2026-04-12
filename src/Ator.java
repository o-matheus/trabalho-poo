public class Ator extends Pessoa{

    private final String cargo = "ATOR";

    public Ator(String nome, String nacionalidade, int idade) {
        super(nome, nacionalidade, idade);
    }

    public Ator() {
    }

    public String getCargo() {
        return cargo;
    }


    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Cargo: " + cargo);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Ator{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}
