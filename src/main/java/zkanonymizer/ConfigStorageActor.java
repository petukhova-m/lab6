

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.*;





        return ReceiveBuilder.create()



    }





    private void redirect(ServerRequest request) {

        int target = rnd.nextInt(data.size());
        sender().tell(data.get(target), getSelf());
    }
}
