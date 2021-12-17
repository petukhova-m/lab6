




import java.util.*;


    private ArrayList<String> data = new ArrayList<>();


        return ReceiveBuilder.create()



    }





    private void redirect(ServerRequest request) {


        sender().tell(data.get(target), getSelf());

}
