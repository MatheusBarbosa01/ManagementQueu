public class Chatbot {
    Queue queue = new Queue();

    public void adicionarChatbot(Client client){
        queue.addClient(client);
    }
    public void removeChatbot(){
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
