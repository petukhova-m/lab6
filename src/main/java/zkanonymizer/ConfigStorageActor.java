


import akka.japi.pf.ReceiveBuilder;

import java.util.*;

public class ConfigStorageActor extends AbstractActor {

    @Override

        return ReceiveBuilder.create()

                .match(ServerList.class, this::saveServerList)

    }



        System.out.println(data);
    }
    private void redirect(ServerRequest request) {
        Random rnd = new Random();


    }
}
