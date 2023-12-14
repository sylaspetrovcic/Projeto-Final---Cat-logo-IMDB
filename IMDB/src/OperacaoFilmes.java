    import java.util.ArrayList;
    import java.util.Iterator;
    class OperacoesFilmes {
        private ArrayList<Filme> usuariosDoBancoDeDados;
        public OperacoesFilmes() {
            this.usuariosDoBancoDeDados = new ArrayList<>();
        }
        public void salvarFilme(Filme filme) {
            boolean emailJaExistente = false;
            for (Filme u : this.usuariosDoBancoDeDados) {
                if (u.getTitulo().equals(filme.getTitulo())) {
                    emailJaExistente = true;
                    break;
                }
            }

            if (!emailJaExistente) {
                usuariosDoBancoDeDados.add(filme);
                System.out.println("Título salvo: " + filme.getTitulo());
            } else {
                System.out.println("Erro: Este titulo já no cadastro.");
            }
        }
        public void excluir(String titulo) {
            Iterator<Filme> iterator = this.usuariosDoBancoDeDados.iterator();
            boolean encontrado = false;

            while (iterator.hasNext()) {
                Filme filme = iterator.next();

                if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println("Removendo título " + filme.getTitulo());
                    iterator.remove(); // Remove o filme encontrado usando o iterador
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.err.println(titulo + " : Título não encontrado");
            }
        }
        public ArrayList<Filme> getUsuariosDoBancoDeDados() {
            return this.usuariosDoBancoDeDados;
        }
        public void pesquisar(String titulo) {
            Iterator<Filme> iterator = this.usuariosDoBancoDeDados.iterator();
            boolean encontrado = false;

            while ((iterator).hasNext()) {
                Filme filme = iterator.next();
                    if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                        System.out.println("Título encontrado : " + titulo);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.err.println(titulo + " : Título não encontrado");
                }
            }
        }

