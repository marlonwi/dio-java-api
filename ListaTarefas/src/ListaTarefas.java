import java.util.ArrayList;
import java.util.List;
public class ListaTarefas {
    private List<Tarefas> listaTarefas;

    public ListaTarefas() {
        setListaTarefas();
    }

    public void setListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public List<Tarefas> getListaTarefas() {
        return listaTarefas;
    }

    public void adicionarTarefa(String tarefa){
        listaTarefas.add(new Tarefas(tarefa));
    }
    public void removerTarefa(String tarefa){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : listaTarefas){
            if(t.getTarefa().equalsIgnoreCase(tarefa))
                tarefasParaRemover.add(t);
        }
        listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }
}
