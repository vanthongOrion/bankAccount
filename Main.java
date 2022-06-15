public class Main {
    public static void main(String[] args){
        Client[] clients = new Client[2];

        clients[0] = new Client(100,"Thong","0989");
        clients[1] = new Client(101,"Thuyet","0988");

        clients[0].addAccount(new Account(100,120,1.2));
        clients[0].addAccount(new Account(101,122,2.9));
        clients[0].getAccounts().get(0).deposit(1000);
        clients[0].getAccounts().get(1).deposit(1000);
        clients[0].getAccounts().get(0).withDraw(500);
        clients[0].getAccounts().get(1).withDraw(500);

        clients[1].addAccount(new Account(103,200,1.9));
        clients[1].addAccount(new Account(104,240,5.9));
        clients[1].getAccounts().get(0).deposit(2000);
        clients[1].getAccounts().get(1).deposit(3000);
        clients[1].getAccounts().get(1).withDraw(800);
        clients[1].getAccounts().get(1).withDraw(800);

        System.out.println("Transaction accountor: ");
        System.out.println("Deposit : " + clients[0].getAccounts().get(0).countTransaction('D'));
        System.out.println("Withdraw : " + clients[1].getAccounts().get(1).countTransaction('W'));




        for(int i=0;i<clients.length;i++){
            System.out.println("Client number : " + (i+1)+"\n" + clients[i].toString());
        }
    }
}
