

import akka.actor.AbstractActor;






    @Override


                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)
                .build();


    private void saveServerList(ServerList list) {

        System.out.println(data);

    private void redirect(ServerRequest request) {




}
