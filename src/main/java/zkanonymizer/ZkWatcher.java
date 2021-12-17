




import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.*;
import org.apache.zookeeper.ZooKeeper;


import java.util.Arrays;
import java.util.List;


public class ZkWatcher implements Watcher {

    private ZooKeeper zk;
    private static final String SERVER_PATH = "/servers";


        this.config = config;

    }





    public void setZk(ZooKeeper zk) {
        this.zk = zk;
    }

    @Override







        if (KeeperState.SyncConnected == keeperState) {
                try {


                    ArrayList<String> serverData = new ArrayList<>();
                    for (String name : list) {
                        serverData.add(new String(zk.getData(SERVER_PATH + '/' + name, this, null)));
                    }

                } catch (KeeperException | InterruptedException e) {
                    e.printStackTrace();


    }
}
