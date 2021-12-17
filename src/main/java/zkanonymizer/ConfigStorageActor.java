

import akka.actor.AbstractActor;


import java.util.*;

public class ConfigStorageActor extends AbstractActor {

    @Override
    public Receive createReceive() {

                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)
                .build();
    }

    private void saveServerList(ServerList list) {

        System.out.println(data);

    private void redirect(ServerRequest request) {

        int target = rnd.nextInt(data.size());


}
