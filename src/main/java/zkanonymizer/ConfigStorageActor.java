

import akka.actor.AbstractActor;




public class ConfigStorageActor extends AbstractActor {



        return ReceiveBuilder.create()

                .match(ServerList.class, this::saveServerList)

    }







        int target = rnd.nextInt(data.size());

    }

