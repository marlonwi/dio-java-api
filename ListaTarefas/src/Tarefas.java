public class Tarefas {
    private String tarefa;
    public Tarefas(String tarefa) {
        setTarefa(tarefa);
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getTarefa() {
        return tarefa;
    }

    @Override
    public String toString() {
        return tarefa;
    }
}
