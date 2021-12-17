package zkanonymizer;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.*;

public class ConfigStorageActor extends AbstractActor {


    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(ServerRequest.class, this::redirect)

                .build();
    }

    private void saveServerList(ServerList list) {
        data = new ArrayList<>(list.getData());
        System.out.println(data);
    }

        Random rnd = new Random();

        sender().tell(data.get(target), getSelf());
    }
}
