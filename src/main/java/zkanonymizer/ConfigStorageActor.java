

import akka.actor.AbstractActor;


import java.util.*;



    @Override


                .match(ServerRequest.class, this::redirect)

                .build();


    private void saveServerList(ServerList list) {

        System.out.println(data);

    private void redirect(ServerRequest request) {

        int target = rnd.nextInt(data.size());


}
