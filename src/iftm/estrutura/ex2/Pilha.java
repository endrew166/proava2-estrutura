package iftm.estrutura.ex2;

public class Pilha <T>{
	 private T[] elementos;
	    private int tamanho;

	    public Pilha(int capacidade){
	        this.elementos = (T[]) new Object[capacidade];
	        this.tamanho = 0;
	    }

	    public Pilha(){
	        this(20);
	    }

	    public boolean estaVazia(){
	        return this.tamanho == 0;
	    }

	    public T topo(){
	        if(this.estaVazia()){
	            return null;
	        }
	        return this.elementos[tamanho-1];
	        
	       
	    }

	    //metodo push da pilha
	    public boolean empilha(T elemento){
	        this.aumentaCapacidade();
	        if(this.tamanho < this.elementos.length){
	            this.elementos[this.tamanho] = elemento;
	            this.tamanho++;
	            return true;
	        }
	        return false;
	    }

	    public T desempilha(){
	        if(this.estaVazia()){
	            return null;
	        }
	        /*
	        T elemento = this.elementos[tamanho-1];
	        tamanho--;
	        return elemento;
	        */
	        return this.elementos[--tamanho];
	    }
		
	    
	    
	    @SuppressWarnings("unchecked")
		private void aumentaCapacidade(){
			if (this.tamanho == this.elementos.length){
				T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
				for (int i=0; i<this.elementos.length; i++){
					elementosNovos[i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
		}

	    public int tamanho(){
	        return this.tamanho;
	    }
	   
	    
	    @Override
		public String toString() {
			
			StringBuilder s = new StringBuilder();
			s.append("[");
			
			for (int i=0; i<this.tamanho-1; i++){
				s.append(this.elementos[i]);
				s.append(", ");
			}
			
			if (this.tamanho>0){
				s.append(this.elementos[this.tamanho-1]);
			}
			
			s.append("]");
			
			return s.toString();
		}
}
