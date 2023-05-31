import java.util.Iterator;
import java.util.LinkedList;
public class Queue {
    LinkedList<Client> clientList = new LinkedList<Client>();

    public void addClient(Client client){
        clientList.addFirst(client);
    }
    public void removeClient(){
        clientList.removeLast();
    }
    public int size(){
        return clientList.size();
    }
    public void isEmpty(){
        clientList.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Client> it = clientList.iterator();
        while (it.hasNext()){
            Client c = it.next();
            sb.append(String.format("%s  " , c.toString()));
        }
        String finalstr = sb.toString();

        return finalstr;
    }
}
