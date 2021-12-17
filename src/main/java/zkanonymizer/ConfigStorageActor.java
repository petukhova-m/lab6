







    private ArrayList<String> data = new ArrayList<>();

    public Receive createReceive() {


                .match(ServerList.class, this::saveServerList)
                .build();


    private void saveServerList(ServerList list) {
        data = new ArrayList<>(list.getData());
        System.out.println(data);

    private void redirect(ServerRequest request) {

        int target = rnd.nextInt(data.size());

    }

