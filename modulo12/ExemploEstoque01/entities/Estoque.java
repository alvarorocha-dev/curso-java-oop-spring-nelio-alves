package modulo12.ExemploEstoque01.entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private String name;

    public Estoque() {        
    }

    public Estoque (String name) {
        this.name = name;
    }
    
    private List<Entrada> entradas = new ArrayList<>();
    private List<Saida> saidas = new ArrayList<>();    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public void removeEntrada(Entrada entrada) {
        entradas.remove(entrada);
    }

    public void addSaida(Saida saida) {
        saidas.add(saida);
    }

    public void removeSaida(Saida saida) {
        saidas.remove(saida);
    }

    public double balancoEntradas() {
        double totalEntradas = 0;        
        for (Entrada e: entradas) {
            totalEntradas += e.totalEntrada();
        }
        return totalEntradas;
    }
    
    public int quantEntradas() {
        int quantEntradas = 0;        
        for (Entrada e: entradas) {
            quantEntradas += e.getQuant();
        }
        return quantEntradas;
    }
    
    public double balancoSaidas() {
        double totalSaidas = 0;
        for (Saida s: saidas) {
            totalSaidas += s.totalSaida();
        }
        return totalSaidas;
    }

    public int quantSaidas() {
        int quantSaidas = 0;
        for(Saida s : saidas) {
            quantSaidas += s.getQuant();
        }
        return quantSaidas;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entrada e : entradas) {
            sb.append(e.getQuant() + " - " + e.getProduto() + "(s) - " + e.getValor() + ": " + String.format("%.2f", e.totalEntrada()));
            sb.append("\n------------ \n");            
        }

        sb.append("\n Registro de Saídas \n");        

        for (Saida s : saidas) {
            sb.append(s.getQuant() + " - " + s.getProduto() + "(s) - " + s.getValor() + ": " + String.format("%.2f", s.totalSaida()));
            sb.append("\n------------ \n");           
        }

        return sb.toString();
    }
}
