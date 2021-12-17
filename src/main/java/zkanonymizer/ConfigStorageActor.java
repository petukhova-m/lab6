package zkanonymizer;

import akka.actor.AbstractActor;




public class ConfigStorageActor extends AbstractActor {
    private ArrayList<String> data = new ArrayList<>();
    @Override


                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)

    }


        data = new ArrayList<>(list.getData());



        Random rnd = new Random();

        sender().tell(data.get(target), getSelf());
    }
}
