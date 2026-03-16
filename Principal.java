public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
            filme1.nome = "O Poderoso Chefão";
            filme1.anoDeLancamento = 1972;
            filme1.totalEmMinutos = 175;

        filme1.exibeFichaTecnica();
    }
}
