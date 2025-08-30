package ar.edu.unlp.oo1.ejercicio1;

/**
 * Completar esta clase de acuerdo a lo especificado
 */
public class WallPost {
        private String textoPost;
        private int cantLikes;
        private boolean isDestacado;
        
        public WallPost(){
            this.textoPost = "Undefined post";
            this.cantLikes = 0;
            this.isDestacado = false;
        }
        
	/**
	 * Retorna el texto descriptivo de la publicación
	 * 
	 * @return
	 */
	public String getText() {
		return this.textoPost;
	};

	/**
	 * Setea el texto descriptivo de la publicación
	 * @param text
	 */
	public void setText(String text) {
		this.textoPost = text;
	};

	/**
	 * Retorna la cantidad de “me gusta”
	 * 
	 * @return
	 */
	public int getLikes() {
		return this.cantLikes;
	};

	/**
	 * Incrementa la cantidad de likes en uno
	 */
	public void like() {
		this.cantLikes ++;
	};

	/**
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 */
	public void dislike() {
		if(this.cantLikes > 0){
                    this.cantLikes--;
                }
	};

	/**
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 * 
	 * @return
	 */
	public boolean isFeatured() {
		return this.isDestacado;
	};

	/**
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	public void toggleFeatured() {
		this.isDestacado = !(this.isDestacado);
	};

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}