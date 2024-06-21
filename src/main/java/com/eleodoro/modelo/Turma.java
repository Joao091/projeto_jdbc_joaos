package com.eleodoro.modelo;

public class Turma {
    
    private int id;
    private int capacidade;
    private int horario;

    
    public Turma() {
    }


    public Turma(int id, int capacidade, int horario) {
        this.id = id;
        this.capacidade = capacidade;
        this.horario = horario;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getCapacidade() {
        return capacidade;
    }


    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


    public int getHorario() {
        return horario;
    }


    public void setHorario(int horario) {
        this.horario = horario;
    }


    @Override
    public String toString() {
        return "Turma [id=" + id + ", capacidade=" + capacidade + ", horario=" + horario + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + capacidade;
        result = prime * result + horario;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Turma other = (Turma) obj;
        if (id != other.id)
            return false;
        if (capacidade != other.capacidade)
            return false;
        if (horario != other.horario)
            return false;
        return true;
    }

    
}
