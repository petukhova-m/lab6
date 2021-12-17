

import akka.actor.AbstractActor;






    @Override


                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)
                .build();




        System.out.println(data);






}
