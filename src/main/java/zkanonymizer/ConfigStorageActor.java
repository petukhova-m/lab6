


import akka.japi.pf.ReceiveBuilder;

import java.util.*;

public class ConfigStorageActor extends AbstractActor {
    private ArrayList<String> data = new ArrayList<>();
    @Override

        return ReceiveBuilder.create()

                .match(ServerList.class, this::saveServerList)

    }



        System.out.println(data);


        Random rnd = new Random();

        sender().tell(data.get(target), getSelf());
    }

