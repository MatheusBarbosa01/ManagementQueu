public class Management {
    int cp=0;
    int cc =0;
    Call[] calls = new Call[6];
    Chatbot chatbots = new Chatbot();

    public Management() {
        createCalls();
    }

    public void addOnCallOrChatbbot(Client client) {


        if (Client.Type.PRIORITY == client.getType()) {
            if(Choice.CALL == client.getChoice()){
                if (cp % 3 == 0) {
                    calls[0].adicionarCall(client);
                } else if (cp % 3 == 1) {
                    calls[1].adicionarCall(client);
                } else if (cp % 3 == 2) {
                    calls[2].adicionarCall(client);
                }
                cp++;
            }else {
                chatbots.adicionarChatbot(client);
            }


        } else{
            if(Choice.CALL == client.getChoice()) {
                if (cc % 3 == 0) {
                    calls[3].adicionarCall(client);
                } else if (cc % 3 == 1) {
                    calls[4].adicionarCall(client);
                } else if (cc % 3 == 2) {
                    calls[5].adicionarCall(client);
                }
                cc++;

            }
            else {
                chatbots.adicionarChatbot(client);
            }
        }

    }
    public void delOnCallOrChatbot(){
        while(chatbots.size() != 0){
            chatbots.removeChatbot();
        }
        while(calls[0].size() != 0){
            calls[0].removeCall();
        }
        while (calls[1].size() != 0){
            calls[1].removeCall();
        }
        while (calls[2].size() != 0){
            calls[2].removeCall();
        }
        while (calls[3].size() != 0){
            calls[3].removeCall();
        }
        while (calls[4].size() != 0){
            calls[4].removeCall();
        }
        while (calls[5].size() != 0){
            calls[5].removeCall();
        }
    }
    public void createCalls(){
        for(int i = 0; i < 6; i++){
            Call call = new Call();
            calls[i] = call;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++) {
            sb.append(String.format("Call0%d)->%s%n ",i, calls[i].toString()));
        }
        System.out.println("Chatbot->" + chatbots.toString()+"\n");
        String finalstr = sb.toString();
        return finalstr;
    }
}
