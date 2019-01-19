/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio4;

/**
 *
 * @author pietrodeocre
 */
public class Libro {
    private long isbn;
    private String titulo, autor;
    private int numeroPaginas;

    

    public long getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro con " + "isbn=" + isbn + ", creado por el autor=" + autor + ", tiene numeroPaginas=" + numeroPaginas + '.';
    }
    
    Libro(){
        
    }
    Libro(long isbn, String titulo, String autor, int numeroPaginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
}
