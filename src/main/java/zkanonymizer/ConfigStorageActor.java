

import akka.actor.AbstractActor;


import java.util.*;



    @Override



                .match(ServerList.class, this::saveServerList)
                .build();


    private void saveServerList(ServerList list) {



    private void redirect(ServerRequest request) {

        int target = rnd.nextInt(data.size());


}
