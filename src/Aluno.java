public class Aluno {
	
	
	
    private String nome;
    private int agen;
	private int id;

    public Aluno() {
    }

    public Aluno(int id, String nome, int agen) {
        this.id = id;
        this.nome = nome;
        this.agen = agen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return agen;
    }

    public void setAge(int agen) {
        this.agen = agen;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", agen=" + agen +
                '}';
    }
}