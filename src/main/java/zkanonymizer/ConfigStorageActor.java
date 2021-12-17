

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;



public class ConfigStorageActor extends AbstractActor {
    private ArrayList<String> data = new ArrayList<>();
    @Override

        return ReceiveBuilder.create()



    }

    private void saveServerList(ServerList list) {


    }
    private void redirect(ServerRequest request) {

        int target = rnd.nextInt(data.size());
        sender().tell(data.get(target), getSelf());
    }
}
