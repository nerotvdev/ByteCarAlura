package src;

public class Carro {

    private int ano;
    private String marca;
    private String modelo;
    private double preco;
    private Cliente titular;

    public Carro(int ano, String modelo, String marca) {
        if (ano >= 2010) {
            this.ano = ano;
        } 
        else {
            System.out.println("O ano informado está inválido. Aceitamos apenas carros 2010 para cima!");
        }
        this.modelo = modelo;
        this.marca = marca;
    }
      // getters e setters

      public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    } 

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
}