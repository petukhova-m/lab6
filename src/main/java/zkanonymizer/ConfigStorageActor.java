

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.*;

public class ConfigStorageActor extends AbstractActor {

    @Override

        return ReceiveBuilder.create()

                .match(ServerList.class, this::saveServerList)

    }

    private void saveServerList(ServerList list) {

        System.out.println(data);
    }

        Random rnd = new Random();
        int target = rnd.nextInt(data.size());
        sender().tell(data.get(target), getSelf());
    }
}
