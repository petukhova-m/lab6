package zkanonymizer;

import akka.actor.AbstractActor;


import java.util.*;

public class ConfigStorageActor extends AbstractActor {
    private ArrayList<String> data = new ArrayList<>();
    @Override
    public Receive createReceive() {

                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)

    }

    private void saveServerList(ServerList list) {
        data = new ArrayList<>(list.getData());



        Random rnd = new Random();

        sender().tell(data.get(target), getSelf());
    }
}
