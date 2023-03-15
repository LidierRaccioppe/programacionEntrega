package com.maximo.estructura;
public class Libro implements Comparable{
    private String titulo;
    private String autor;
    private String isbn;
    private int precio;
    private int numUnidades;
    public Libro(String titulo, String autor, String isbn, int precio, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.numUnidades = numUnidades;
    }
    public Libro() {
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getNumUnidades() {
        return numUnidades;
    }
    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }
    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", precio=" + precio + ", numUnidades=" + numUnidades + '}';
    }
    @Override
    public int compareTo(Object o){
        Libro j = (Libro) o ; // casteo de un objeto mas general a uno mas especifico
        if(this.titulo.compareToIgnoreCase(j.titulo)>0) return 1;
        else if(this.titulo.compareToIgnoreCase(j.titulo)<0) return -1;
        else return 0;
    }
}