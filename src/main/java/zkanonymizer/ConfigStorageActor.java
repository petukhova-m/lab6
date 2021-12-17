

import akka.actor.AbstractActor;









                .match(ServerRequest.class, this::redirect)

                .build();


    private void saveServerList(ServerList list) {

        System.out.println(data);






}
