package src;

public class VendaCarro {
    public static void main(String[] args) {
        
        //Cria Clientes ln carro ln set carro
        
        Cliente mariana = new Cliente();
        mariana.setNome("Mariana Bello");
		mariana.setCpf("222.222.222.-22");
		mariana.setProfissao("Etéticista");
        mariana.setEndereço("Rua Dona do Ó");

        Carro carroDaMariana = new Carro(2015, "Prisma", "Chevrolet");
       
        carroDaMariana.setPreco(50000);
        carroDaMariana.setTitular(mariana);

        Cliente nero = new Cliente();
        nero.setNome("Nero");
		nero.setCpf("222.222.222.-22");
		nero.setProfissao("Programador");
        nero.setEndereço("Travessa WE 46");

        Carro carroDoNero = new Carro(2022, "Ram 2500", "Ram");

        carroDoNero.setPreco(200000);
        carroDoNero.setTitular(nero);


        System.out.println("Comprador: " + carroDaMariana.getTitular().getNome());
        System.out.println("O carro foi comprado por R$" + carroDaMariana.getPreco());

        System.out.println();

        System.out.println("Comprador: " + carroDoNero.getTitular().getNome());
        System.out.println("O carro foi comprado por R$" + carroDoNero.getPreco());


    } 
}
