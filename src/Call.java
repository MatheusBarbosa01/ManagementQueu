public class Call {
    Queue queue = new Queue();

    public void adicionarCall(Client client){
        queue.addClient(client);
    }
    public void removeCall(){
        queue.removeClient();
    }
    public int size(){
        return queue.size();
    }
    public void isEmpty(){
        queue.isEmpty();
    }
    @Override
    public String toString() {
        return queue.toString();
    }
}
