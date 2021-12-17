




import java.util.*;



    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)

    }

    private void saveServerList(ServerList list) {

        System.out.println(data);

    private void redirect(ServerRequest request) {
        Random rnd = new Random();


    }
}
