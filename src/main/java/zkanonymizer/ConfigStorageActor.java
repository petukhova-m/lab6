

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.*;


    private ArrayList<String> data = new ArrayList<>();
    @Override

        return ReceiveBuilder.create()



    }

    private void saveServerList(ServerList list) {


    }
    private void redirect(ServerRequest request) {
        Random rnd = new Random();
        int target = rnd.nextInt(data.size());
        sender().tell(data.get(target), getSelf());
    }
}
