

import akka.actor.AbstractActor;









                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)
                .build();






    private void redirect(ServerRequest request) {





