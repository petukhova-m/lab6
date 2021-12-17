





import org.apache.zookeeper.Watcher.Event.*;
import org.apache.zookeeper.ZooKeeper;


import java.util.Arrays;
import java.util.List;


public class ZkWatcher implements Watcher {


    private static final String SERVER_PATH = "/servers";










    public void setZk(ZooKeeper zk) {
        this.zk = zk;
    }

    @Override











                    ArrayList<String> serverData = new ArrayList<>();
                    for (String name : list) {

                    }


                    e.printStackTrace();


    }
}
