







    private ArrayList<String> data = new ArrayList<>();

    public Receive createReceive() {


                .match(ServerList.class, this::saveServerList)



    private void saveServerList(ServerList list) {
        data = new ArrayList<>(list.getData());
        System.out.println(data);



        int target = rnd.nextInt(data.size());

    }

