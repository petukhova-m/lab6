

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;




    private ArrayList<String> data = new ArrayList<>();
    @Override

        return ReceiveBuilder.create()

                .match(ServerList.class, this::saveServerList)

    }

    private void saveServerList(ServerList list) {

        System.out.println(data);

    private void redirect(ServerRequest request) {
        Random rnd = new Random();
        int target = rnd.nextInt(data.size());
        sender().tell(data.get(target), getSelf());
    }
}
