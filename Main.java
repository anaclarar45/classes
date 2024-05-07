class Roupa {
     private String cor;
     private String tamanho;
    
       public boolean vestir() {
            if (cor != null && tamanho != null) {
                System.out.println("Roupa vestida!");
                System.out.println("Cor: " + cor);
                System.out.println("Tamanho: " + tamanho);
              
                return true;
            } else {
                System.out.println("Erro ao vestir roupa: informações incompletas.");
                return false;
            }
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }
   }


    public class Main {
        public static void main(String[] args) {
            Roupa camiseta = new Roupa();
            camiseta.setCor("Ciano");
            camiseta.setTamanho("P");

            camiseta.vestir();
        }
    }
