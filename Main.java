public class Main {

    public static void main(String[] args)
    {
        Galinha email = new Galinha();
        Galinha.nome = "Burita";
        Galinha.cellphone = 932001002;
        email.setEmail("burita_bonita@gmail.com");


        System.out.println("O nome da galinha é: " + Galinha.nome + "\n" +
                           "O número de telefone é o: " + Galinha.cellphone + "\n" +
                           "O email corresponde é: " + email.getEmail());
    }
}