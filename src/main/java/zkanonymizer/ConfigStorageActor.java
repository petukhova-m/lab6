


import akka.japi.pf.ReceiveBuilder;

import java.util.*;

public class ConfigStorageActor extends AbstractActor {
    private ArrayList<String> data = new ArrayList<>();
    @Override



                .match(ServerList.class, this::saveServerList)

    }



        System.out.println(data);
    }
    private void redirect(ServerRequest request) {
        Random rnd = new Random();

        sender().tell(data.get(target), getSelf());
    }
}
