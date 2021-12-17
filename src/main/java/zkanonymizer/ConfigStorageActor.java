package zkanonymizer;

import akka.actor.AbstractActor;




public class ConfigStorageActor extends AbstractActor {
    private ArrayList<String> data = new ArrayList<>();




                .match(ServerList.class, this::saveServerList)




        data = new ArrayList<>(list.getData());





        sender().tell(data.get(target), getSelf());
    }
}
