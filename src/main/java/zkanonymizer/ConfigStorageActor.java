package zkanonymizer;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.*;

public class ConfigStorageActor extends AbstractActor {
    private ArrayList<String> data = new ArrayList<>();
    @Override

        return ReceiveBuilder.create()
                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)

    }

    private void saveServerList(ServerList list) {

        System.out.println(data);
    }
    private void redirect(ServerRequest request) {
        Random rnd = new Random();
        int target = rnd.nextInt(data.size());
        sender().tell(data.get(target), getSelf());
    }

