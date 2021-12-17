

import akka.actor.AbstractActor;


import java.util.*;






                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)
                .build();




        System.out.println(data);

    private void redirect(ServerRequest request) {




}
