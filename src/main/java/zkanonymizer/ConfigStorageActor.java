

import akka.actor.AbstractActor;




public class ConfigStorageActor extends AbstractActor {



        return ReceiveBuilder.create()

                .match(ServerList.class, this::saveServerList)

    }






        Random rnd = new Random();
        int target = rnd.nextInt(data.size());

    }

