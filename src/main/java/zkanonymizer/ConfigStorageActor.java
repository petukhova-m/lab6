

import akka.actor.AbstractActor;


import java.util.*;

public class ConfigStorageActor extends AbstractActor {

    @Override


                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)
                .build();


    private void saveServerList(ServerList list) {

        System.out.println(data);



        int target = rnd.nextInt(data.size());


}
