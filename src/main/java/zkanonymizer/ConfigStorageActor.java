

import akka.actor.AbstractActor;


import java.util.*;






                .match(ServerRequest.class, this::redirect)

                .build();




        System.out.println(data);

    private void redirect(ServerRequest request) {





