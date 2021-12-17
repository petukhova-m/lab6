









    public Receive createReceive() {


                .match(ServerList.class, this::saveServerList)



    private void saveServerList(ServerList list) {
        data = new ArrayList<>(list.getData());




        int target = rnd.nextInt(data.size());

    }

