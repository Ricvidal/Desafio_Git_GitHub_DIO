package br.com.dio.model;



public class Livro {
	
	String titulo;
	String autor;
	String isbn;
	
	
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livro(String titulo, String autor, String isbn ) {
		// TODO Auto-generated constructor stub
		this.titulo=titulo;
		this.autor=autor;
		this.isbn=isbn;
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

	
	

}
