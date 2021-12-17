

import akka.actor.AbstractActor;


import java.util.*;



    @Override


                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)
                .build();


    private void saveServerList(ServerList list) {



    private void redirect(ServerRequest request) {




}
